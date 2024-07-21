package com.sky.service;


import com.sky.dto.DishDTO;

public interface DishService {
    /**
     * 新增菜品相对口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
