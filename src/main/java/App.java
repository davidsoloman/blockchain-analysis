import analysis.BlockAnalyser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;


public class App {
   private static final Logger log = LoggerFactory.getLogger(App.class);

   public static void main(String[] args) {
      BlockAnalyser blockAnalyser = new BlockAnalyser();

      try {
         blockAnalyser.createTransactions();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
