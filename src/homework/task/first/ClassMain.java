package homework.task.first;

public class ClassMain {
    public static void main(String args[]) {
        ClassObjectMapper ObjMap = new ClassObjectMapper();
        ClassSimpleBin simplebin = new ClassSimpleBin();
        ObjMap.save(simplebin);
    }    
}
