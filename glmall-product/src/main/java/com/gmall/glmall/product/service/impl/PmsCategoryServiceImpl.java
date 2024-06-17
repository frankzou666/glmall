package com.gmall.glmall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.common.utils.Query;

import com.gmall.glmall.product.dao.PmsCategoryDao;
import com.gmall.glmall.product.entity.PmsCategoryEntity;
import com.gmall.glmall.product.service.PmsCategoryService;


@Service("pmsCategoryService")
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryDao, PmsCategoryEntity> implements PmsCategoryService {

    @Autowired
    PmsCategoryDao pmsCategoryDao;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<PmsCategoryEntity> page = this.page(
                new Query<PmsCategoryEntity>().getPage(params),
                new QueryWrapper<PmsCategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<PmsCategoryEntity> listWithTree() {
        //列出所有分类
        List<PmsCategoryEntity> pmsCategoryEntityList = pmsCategoryDao.selectList(null);




        //组状父子结构
        // 1.找到所有一级分类
        List<PmsCategoryEntity> menuList0= pmsCategoryEntityList.stream().filter((item)->{
             return  item.getParentCid() ==0;
        }).map(item->{
              item.setChildren(getChildrens(item,pmsCategoryEntityList));
              return item;
        }).collect(Collectors.toList());

        return menuList0;
    }

    @Override
    public void removeByMenuIds(List<Long> list) {
        //TODO:需要检查有子菜单是否能删除
        //一般尽量用逻辑删除，使用标志来确定是否删除
        baseMapper.deleteBatchIds(list);
    }

    //根据一个PmsCategoryEntity，找到子菜单
    public List<PmsCategoryEntity> getChildrens(PmsCategoryEntity pmsCategoryEntity,List<PmsCategoryEntity> all) {
        //如果一个菜单的parcentcid是这个category的id,那说明是他的子项
        List<PmsCategoryEntity> menuList= all.stream().filter((item)->{
            return  item.getParentCid() == pmsCategoryEntity.getCatId();
        }).map(item->{
            item.setChildren(getChildrens(item,all));
            return  item;
        }).collect(Collectors.toList());
        return menuList;
    }

}