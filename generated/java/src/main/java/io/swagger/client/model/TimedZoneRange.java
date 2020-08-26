/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ZoneRange;
import java.io.IOException;

/**
 * A union type representing the time spent in a given zone.
 */
@ApiModel(description = "A union type representing the time spent in a given zone.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-25T09:54:08.975-03:00")
public class TimedZoneRange {
  @SerializedName("min")
  private Integer min = null;

  @SerializedName("max")
  private Integer max = null;

  @SerializedName("time")
  private Integer time = null;

  public TimedZoneRange min(Integer min) {
    this.min = min;
    return this;
  }

   /**
   * The minimum value in the range.
   * @return min
  **/
  @ApiModelProperty(value = "The minimum value in the range.")
  public Integer getMin() {
    return min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public TimedZoneRange max(Integer max) {
    this.max = max;
    return this;
  }

   /**
   * The maximum value in the range.
   * @return max
  **/
  @ApiModelProperty(value = "The maximum value in the range.")
  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  public TimedZoneRange time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * The number of seconds spent in this zone
   * @return time
  **/
  @ApiModelProperty(value = "The number of seconds spent in this zone")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimedZoneRange timedZoneRange = (TimedZoneRange) o;
    return Objects.equals(this.min, timedZoneRange.min) &&
        Objects.equals(this.max, timedZoneRange.max) &&
        Objects.equals(this.time, timedZoneRange.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimedZoneRange {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
