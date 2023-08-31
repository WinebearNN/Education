package xRep.homework.variant1;

public class University {

    private ZavKafedry[] zavKafedries;

    private Researcher[] researchers;

    private Student[] students; /*так как у научных сотрудников уже есть свой список студентов, которые являются практикантами,
    то в этом списке мы учитываем только тех, кто ими не является*/

    private Teacher[] teachers;/* аналогично, как и со студентами
    */

    private double[] info;

    public University(ZavKafedry[] zavKafedries, Researcher[] researchers, Student[] students) {
        this.zavKafedries = zavKafedries;
        this.researchers = researchers;
        this.students = students;
    }

    private void allInfo(){
        double Ssalary=0, Tsalary=0, Zsalary = 0,Rsalary=0;
        int cStudents=0,cZavKaf=0,cTeachers=0,cResearches=0;
        int SminAge=0, TminAge=0,ZminAge=0,RminAge=0;
        int SmaxAge=0, TmaxAge=0, ZmaxAge=0, RmaxAge=0;
        for(ZavKafedry i:zavKafedries){
            Zsalary+=i.salary();
            cZavKaf++;
            ZmaxAge=Math.max(ZmaxAge,i.getAge());
            ZminAge=Math.min(ZminAge,i.getAge());
            for (Teacher j:i.getTeachers()){
                Tsalary+= j.salary();
                cTeachers++;
                TmaxAge=Math.max(TmaxAge,j.getAge());
                TminAge=Math.min(TminAge,j.getAge());
            }
        }
        for (Researcher i:researchers){
            Rsalary+=i.salary();
            cResearches++;
            RmaxAge=Math.max(RmaxAge,i.getAge());
            RminAge=Math.min(RminAge,i.getAge());
            for (Student j:i.getStudents()){
                Ssalary+=j.salary();
                cStudents++;
                SmaxAge=Math.max(SmaxAge,j.getAge());
                SminAge=Math.min(SminAge,j.getAge());
            }
        }
        for (Teacher i:teachers){
            Tsalary+=i.salary();
            cTeachers++;
            TmaxAge=Math.max(TmaxAge,i.getAge());
            TminAge=Math.min(TminAge, i.getAge());
        }
        for (Student i:students){
            cStudents++;
            SmaxAge=Math.max(SmaxAge,i.getAge());
            SminAge=Math.min(SminAge,i.getAge());
            Tsalary+=i.salary();
        }
        this.info= new double[]{Ssalary, Tsalary, Zsalary,Rsalary,cStudents,cZavKaf,cTeachers,cResearches,SminAge, TminAge,ZminAge,RminAge, SmaxAge, TmaxAge, ZmaxAge, RmaxAge};
    }

    public double allSalary(){
        return info[0]+info[1]+info[2]+info[3];
    }

    public double middleSalaryStud(){
        return info[0]/info[4];
    }

    public double middleSalaryTeach(){
        return info[1]/info[6];
    }

    public double middleSalaryZav(){
        return info[2]/info[5];
    }

    public double middleSalaryRes(){
        return info[3]/info[7];
    }

    public double[] maxMinAgeS(){
        return new double[]{info[8],info[12]};
    }

    public double[] maxMinAgeT(){
        return new double[]{info[9],info[13]};
    }
    public double[] maxMinAgeR(){
        return new double[]{info[11],info[15]};
    }
    public double[] maxMinAgeZ(){
        return new double[]{info[10],info[14]};
    }

    public ZavKafedry[] getZavKafedries() {
        return zavKafedries;
    }

    public void setZavKafedries(ZavKafedry[] zavKafedries) {
        this.zavKafedries = zavKafedries;
    }

    public Researcher[] getResearchers() {
        return researchers;
    }

    public void setResearchers(Researcher[] researchers) {
        this.researchers = researchers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public double[] getInfo() {
        return info;
    }

    public void setInfo(double[] info) {
        this.info = info;
    }
}
