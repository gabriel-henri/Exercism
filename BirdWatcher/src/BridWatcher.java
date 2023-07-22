
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        int day = (this.birdsPerDay.length)-1;
        return this.birdsPerDay[day];
    }

    public void incrementTodaysCount() {
        int day = this.birdsPerDay.length-1;
         this.birdsPerDay[day] +=1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < this.birdsPerDay.length; i++){
            if(this.birdsPerDay[i] == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        if(numberOfDays > this.birdsPerDay.length){
            numberOfDays = this.birdsPerDay.length;
        }
        for(int i = 0; i < numberOfDays; i++){
            sum += this.birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyday = 0;
        for(int day:this.birdsPerDay){
            if(day >= 5){
                busyday += 1;
            }
        }
        return busyday;
    }
}
