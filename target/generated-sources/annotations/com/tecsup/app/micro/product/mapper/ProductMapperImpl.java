package com.tecsup.app.micro.product.mapper;

import com.tecsup.app.micro.product.client.User;
import com.tecsup.app.micro.product.dto.Product;
import com.tecsup.app.micro.product.entity.ProductEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-13T21:51:11-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.15 (Homebrew)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toDomain(ProductEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( entity.getId() );
        product.setName( entity.getName() );
        product.setDescription( entity.getDescription() );
        product.setPrice( entity.getPrice() );
        product.setStock( entity.getStock() );
        product.setCategory( entity.getCategory() );

        return product;
    }

    @Override
    public ProductEntity toEntity(Product domain) {
        if ( domain == null ) {
            return null;
        }

        ProductEntity productEntity = new ProductEntity();

        productEntity.setCreatedBy( domainCreatedByUserId( domain ) );
        productEntity.setId( domain.getId() );
        productEntity.setName( domain.getName() );
        productEntity.setDescription( domain.getDescription() );
        productEntity.setPrice( domain.getPrice() );
        productEntity.setStock( domain.getStock() );
        productEntity.setCategory( domain.getCategory() );

        return productEntity;
    }

    private Long domainCreatedByUserId(Product product) {
        if ( product == null ) {
            return null;
        }
        User createdByUser = product.getCreatedByUser();
        if ( createdByUser == null ) {
            return null;
        }
        Long id = createdByUser.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
