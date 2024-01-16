package com.mashibing.selfbdrpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.core.PriorityOrdered;

public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("执行postProcessBeanDefinitionRegistry---MyBeanDefinitionRegistryPostProcessor");
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MySelfBeanDefinitionRegistryPostProcessor.class);
        builder.addPropertyValue("name","zhangsan");
        // 向BeanDefinitionRegistry注册Bean实例。在beanFactory.getBeanNamesForType的地方进行获取
        registry.registerBeanDefinition("msb",builder.getBeanDefinition());
    }

    /**
     * ConfigurableListableBeanFactory 没有实现 BeanDefinitionRegistryPostProcessor的接口，或者当前方法不支持对BeanDefinition进行注册
     * 所以说，在对实现了BFPP的接口进行处理的时候  就不需要考虑是否有新增的BFPP。
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("执行postProcessBeanFactory---MyBeanDefinitionRegistryPostProcessor");
        BeanDefinition msb = beanFactory.getBeanDefinition("msb");
        msb.getPropertyValues().getPropertyValue("name").setConvertedValue("lisi");
        System.out.println("===============");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
