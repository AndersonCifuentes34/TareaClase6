package pkgLista;

public class ClsTaskList {
    private String taskName;
    private String taskDescripcion;
    private boolean isDone;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescripcion() {
        return taskDescripcion;
    }

    public void setTaskDescripcion(String taskDescripcion) {
        this.taskDescripcion = taskDescripcion;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
