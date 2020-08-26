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
import java.io.IOException;

/**
 * Split
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-25T09:54:08.975-03:00")
public class Split {
  @SerializedName("average_speed")
  private Float averageSpeed = null;

  @SerializedName("distance")
  private Float distance = null;

  @SerializedName("elapsed_time")
  private Integer elapsedTime = null;

  @SerializedName("elevation_difference")
  private Float elevationDifference = null;

  @SerializedName("pace_zone")
  private Integer paceZone = null;

  @SerializedName("moving_time")
  private Integer movingTime = null;

  @SerializedName("split")
  private Integer split = null;

  public Split averageSpeed(Float averageSpeed) {
    this.averageSpeed = averageSpeed;
    return this;
  }

   /**
   * The average speed of this split, in meters per second
   * @return averageSpeed
  **/
  @ApiModelProperty(value = "The average speed of this split, in meters per second")
  public Float getAverageSpeed() {
    return averageSpeed;
  }

  public void setAverageSpeed(Float averageSpeed) {
    this.averageSpeed = averageSpeed;
  }

  public Split distance(Float distance) {
    this.distance = distance;
    return this;
  }

   /**
   * The distance of this split, in meters
   * @return distance
  **/
  @ApiModelProperty(value = "The distance of this split, in meters")
  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public Split elapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * The elapsed time of this split, in seconds
   * @return elapsedTime
  **/
  @ApiModelProperty(value = "The elapsed time of this split, in seconds")
  public Integer getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public Split elevationDifference(Float elevationDifference) {
    this.elevationDifference = elevationDifference;
    return this;
  }

   /**
   * The elevation difference of this split, in meters
   * @return elevationDifference
  **/
  @ApiModelProperty(value = "The elevation difference of this split, in meters")
  public Float getElevationDifference() {
    return elevationDifference;
  }

  public void setElevationDifference(Float elevationDifference) {
    this.elevationDifference = elevationDifference;
  }

  public Split paceZone(Integer paceZone) {
    this.paceZone = paceZone;
    return this;
  }

   /**
   * The pacing zone of this split
   * @return paceZone
  **/
  @ApiModelProperty(value = "The pacing zone of this split")
  public Integer getPaceZone() {
    return paceZone;
  }

  public void setPaceZone(Integer paceZone) {
    this.paceZone = paceZone;
  }

  public Split movingTime(Integer movingTime) {
    this.movingTime = movingTime;
    return this;
  }

   /**
   * The moving time of this split, in seconds
   * @return movingTime
  **/
  @ApiModelProperty(value = "The moving time of this split, in seconds")
  public Integer getMovingTime() {
    return movingTime;
  }

  public void setMovingTime(Integer movingTime) {
    this.movingTime = movingTime;
  }

  public Split split(Integer split) {
    this.split = split;
    return this;
  }

   /**
   * N/A
   * @return split
  **/
  @ApiModelProperty(value = "N/A")
  public Integer getSplit() {
    return split;
  }

  public void setSplit(Integer split) {
    this.split = split;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Split split = (Split) o;
    return Objects.equals(this.averageSpeed, split.averageSpeed) &&
        Objects.equals(this.distance, split.distance) &&
        Objects.equals(this.elapsedTime, split.elapsedTime) &&
        Objects.equals(this.elevationDifference, split.elevationDifference) &&
        Objects.equals(this.paceZone, split.paceZone) &&
        Objects.equals(this.movingTime, split.movingTime) &&
        Objects.equals(this.split, split.split);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageSpeed, distance, elapsedTime, elevationDifference, paceZone, movingTime, split);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Split {\n");
    
    sb.append("    averageSpeed: ").append(toIndentedString(averageSpeed)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    elevationDifference: ").append(toIndentedString(elevationDifference)).append("\n");
    sb.append("    paceZone: ").append(toIndentedString(paceZone)).append("\n");
    sb.append("    movingTime: ").append(toIndentedString(movingTime)).append("\n");
    sb.append("    split: ").append(toIndentedString(split)).append("\n");
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

