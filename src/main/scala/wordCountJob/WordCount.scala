package wordCountJob

import com.typesafe.config.{Config, ConfigFactory}
import org.apache.spark._
import spark.jobserver._

class WordCount extends SparkJob {
  private val data = Array(1, 2, 3)

  def main(args: Array[String]) {
    val conf = new SparkConf().setMaster("local[4]").setAppName("WordCount")
    val sc = new SparkContext(conf)
    val config = ConfigFactory.parseString("")
    val results = runJob(sc, config)
    println("Result is " + results)
  }

  override def validate(sc: SparkContext, config: Config): SparkJobValidation = {
    SparkJobValid
  }

  override def runJob(sc: SparkContext, config: Config): Any = {
    val dd = sc.parallelize(data)
    dd.map( _ * 2 ).collect()
  }
}
