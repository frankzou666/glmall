package com.gmall.glmall.member.feign;


import com.gmall.glmall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

//要调用哪个远程服务，这个服务是nacos上的服务名称，或是说远程服务的sping.application.name
@FeignClient("glmall-coupon")
public interface CouponFeignService {

    //在另一个服务器上的contorller的完成整签名，注意getMapping要路径写全
    @GetMapping("/coupon/coupon/member/list")
    public R getMemmberCoupons();
}
