package com.atguigu.gulimall.product.service.impl;

import com.atguigu.gulimall.product.vo.SpuSaveVo;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.SpuInfoDao;
import com.atguigu.gulimall.product.entity.SpuInfoEntity;
import com.atguigu.gulimall.product.service.SpuInfoService;


@Service("spuInfoService")
public class SpuInfoServiceImpl extends ServiceImpl<SpuInfoDao, SpuInfoEntity> implements SpuInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SpuInfoEntity> page = this.page(
                new Query<SpuInfoEntity>().getPage(params),
                new QueryWrapper<SpuInfoEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public void saveSpuInfo(SpuSaveVo vo) {
        //1、保存spu基本信息：pms_spu_info

        //2、保存spu描述图片：pms_spu_info_desc

        //3、保存spu图片集：pms_spu_info_desc

        //4、保存spu规格参数：pms_spu_images

        //5、保存spu积分信息：sms_spu_bounds

        //5、保存当前spu对应的sku信息：

        //5、1保存sku基本信息：pms_sku_info
        //5、2保存sku图片信息：pms_sku_images
        //5、3保存sku销售属性信息：pms_sku_sale_attr_value
        //5、4保存sku的优惠、满减信息：gulimall_sms->sms_sku_ladder\sms_sku_full_reduction\sms_member_price
    }

}