package com.imooc.o2o.service;

import java.io.File;
import java.util.List;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Area;
import com.imooc.o2o.entity.Shop;

public interface ShopService {
	ShopExecution addShop(Shop shop, File shopImg);
}
