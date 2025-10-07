package br.com.storefront.mapper;

import br.com.storefront.dto.ProductInfoDTO;
import br.com.storefront.entity.ProductEntity;
import org.mapstruct.Mapper;

import java.math.BigDecimal;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

@Mapper(componentModel = SPRING)
public interface IProductMapper {

    ProductInfoDTO toDTO(final ProductEntity entity, final BigDecimal price);

}
