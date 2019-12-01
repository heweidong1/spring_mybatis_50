package com.kgc.config;

import com.kgc.mybatis.KgcImportBeanDefiniionRegistart;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Import(KgcImportBeanDefiniionRegistart.class)
public @interface KgcScan {
}
