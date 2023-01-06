public class Worker {
    int id;
    int salary;
    String name;
    String Famaly;

    @Override
    public String toString() {
        return String.format("%s-name %d-salary", name, salary);
    }

    @Override
    public boolean equals(Object obj) {
        Worker t = (Worker) obj;
        return id == t.id && name == t.name;
    }
}
