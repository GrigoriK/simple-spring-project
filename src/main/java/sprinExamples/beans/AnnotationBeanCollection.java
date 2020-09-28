package sprinExamples.beans;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
@Component
@Data
public class AnnotationBeanCollection {
    private ArrayList<Class> annotationClassCollection = new ArrayList<>();

    public void addClassToAnnotationClassCollection(Class clazz){
          annotationClassCollection.add(clazz);
    }
}
