import java.time.LocalDate;
import java.time.Period;

public class Wine {
   private String wineName;
   private String wineMark;
   private String wineCountry;
   private LocalDate date;
   private String Description;

   public Wine() {
   }

   public Wine(String wineName, String wineMark, String wineCountry, LocalDate date, String description) {
      this.wineName = wineName;
      this.wineMark = wineMark;
      this.wineCountry = wineCountry;
      this.date = date;
      Description = description;
   }

   public String getWineName() {
      return wineName;
   }

   public void setWineName(String wineName) {
      this.wineName = wineName;
   }

   public String getWineMark() {
      return wineMark;
   }

   public void setWineMark(String wineMark) {
      this.wineMark = wineMark;
   }

   public String getWineCountry() {
      return wineCountry;
   }

   public void setWineCountry(String wineCountry) {
      this.wineCountry = wineCountry;
   }

   public LocalDate getDate() {
      return date;
   }

   public void setDate(LocalDate date) {
      this.date = date;
   }

   public String getDescription() {
      return Description;
   }

   public void setDescription(String description) {
      Description = description;
   }

   public void wineValable (LocalDate now){
      int years = Period.between(date, now).getYears();
      System.out.println("Вино действителень " + years + " лет");
   }
}
