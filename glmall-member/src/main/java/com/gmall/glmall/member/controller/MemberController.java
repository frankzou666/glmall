package com.gmall.glmall.member.controller;

import java.util.Arrays;
import java.util.Map;

//import org.apache.shiro.authz.annotation.RequiresPermissions;
import com.gmall.glmall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.gmall.glmall.member.entity.MemberEntity;
import com.gmall.glmall.member.service.MemberService;
import com.gmall.glmall.common.utils.PageUtils;
import com.gmall.glmall.common.utils.R;



/**
 * ��Ա
 *
 * @author gg
 * @email gg
 * @date 2024-04-17 15:43:18
 */
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;


    //测试调用feign
    @Autowired
    CouponFeignService couponFeignService;

    @GetMapping("/coupons")
    public  R testMemberCoupons() {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("张三");

        //调用openFiegn的服务，
        R couponsMember = couponFeignService.getMemmberCoupons();
        return R.ok().put("member",memberEntity).put("counpons",couponsMember);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
   // @RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
