package com.devpro.shop13.services;

import java.io.File;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.devpro.shop13.entities.SaleorderProductEntity;
import com.github.slugify.Slugify;
@Service
public class SaleOrderProductService extends BaseService<SaleorderProductEntity> {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	protected EntityManager em() {
		// TODO Auto-generated method stub
		return entityManager;
	}

	@Override
	protected Class<SaleorderProductEntity> clazz() {
		// TODO Auto-generated method stub
		return SaleorderProductEntity.class;
	}

	
	@Transactional(rollbackOn = Exception.class)
	public SaleorderProductEntity save(SaleorderProductEntity saleOrderProduct) throws Exception {
		try {
			//SaleOrderProduct.setSeo(new Slugify().slugify(saleOrderProduct.get));

			// save to db
			SaleorderProductEntity saved = super.saveOrUpdate(saleOrderProduct);
			return saved;
		} catch (Exception e) {
			throw e;
		}
	}

}
