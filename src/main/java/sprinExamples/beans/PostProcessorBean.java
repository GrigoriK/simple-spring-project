package sprinExamples.beans;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import sprinExamples.annotations.UserAnnotation;

@Component
@RequiredArgsConstructor
public class PostProcessorBean implements BeanPostProcessor {

    private final AnnotationBeanCollection annotationBeanCollection;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Class<?> clazz = bean.getClass();

        if (clazz.isAnnotationPresent(UserAnnotation.class)) {
            annotationBeanCollection.addClassToAnnotationClassCollection(clazz);
        }

        return bean;
    }
}
