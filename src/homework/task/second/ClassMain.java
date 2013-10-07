package homework.task.second;

public class ClassMain {
    
    public static void main(String args[]) {
        ClassObjectMapper ObjMap = new ClassObjectMapper();
        ClassSimpleBin simplebin = new ClassSimpleBin();
        ObjMap.save(simplebin);
        ObjMap.saveByConfig();
    }    
}
