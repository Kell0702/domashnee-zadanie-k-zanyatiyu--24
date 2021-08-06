import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.stats.StatsServes;


class StatsService {
    @ParameterizedTest
    @CsvFileSource(resources = "/BaseMonth.csv")
    // подготавливаем данные:
    long[] arr;
    StatsServes serves = new StatsServes();

}
