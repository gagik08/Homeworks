package javaEssential.hw7.task2;

public class Worker implements Comparable<Worker>{
    private String fullName;
    private String jobTitle;
    private int jobApplying;

    public Worker(String fullName, String jobTitle, int jobApplying) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.jobApplying = jobApplying;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getJobApplying() {
        return jobApplying;
    }

    public void setJobApplying(int jobApplying) {
        this.jobApplying = jobApplying;
    }

    public static String splitSurname (String fullName){
        String[] name = fullName.split(" ");
        return name[1];
    }

    public int compareTo(Worker w) {
        return this.fullName.compareTo(w.getFullName());
    }

    @Override
    public String toString() {
        return "Worker{" +
                "fullName='" + fullName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobApplying=" + jobApplying +
                '}'+"\n";
    }
}


