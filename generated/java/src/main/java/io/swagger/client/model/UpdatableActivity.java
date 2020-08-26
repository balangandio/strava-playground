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
import io.swagger.client.model.ActivityType;
import java.io.IOException;

/**
 * UpdatableActivity
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-25T09:54:08.975-03:00")
public class UpdatableActivity {
  @SerializedName("commute")
  private Boolean commute = null;

  @SerializedName("trainer")
  private Boolean trainer = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private ActivityType type = null;

  @SerializedName("gear_id")
  private String gearId = null;

  public UpdatableActivity commute(Boolean commute) {
    this.commute = commute;
    return this;
  }

   /**
   * Whether this activity is a commute
   * @return commute
  **/
  @ApiModelProperty(value = "Whether this activity is a commute")
  public Boolean isCommute() {
    return commute;
  }

  public void setCommute(Boolean commute) {
    this.commute = commute;
  }

  public UpdatableActivity trainer(Boolean trainer) {
    this.trainer = trainer;
    return this;
  }

   /**
   * Whether this activity was recorded on a training machine
   * @return trainer
  **/
  @ApiModelProperty(value = "Whether this activity was recorded on a training machine")
  public Boolean isTrainer() {
    return trainer;
  }

  public void setTrainer(Boolean trainer) {
    this.trainer = trainer;
  }

  public UpdatableActivity description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of the activity
   * @return description
  **/
  @ApiModelProperty(value = "The description of the activity")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdatableActivity name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the activity
   * @return name
  **/
  @ApiModelProperty(value = "The name of the activity")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdatableActivity type(ActivityType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public ActivityType getType() {
    return type;
  }

  public void setType(ActivityType type) {
    this.type = type;
  }

  public UpdatableActivity gearId(String gearId) {
    this.gearId = gearId;
    return this;
  }

   /**
   * Identifier for the gear associated with the activity. ‘none’ clears gear from activity
   * @return gearId
  **/
  @ApiModelProperty(value = "Identifier for the gear associated with the activity. ‘none’ clears gear from activity")
  public String getGearId() {
    return gearId;
  }

  public void setGearId(String gearId) {
    this.gearId = gearId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatableActivity updatableActivity = (UpdatableActivity) o;
    return Objects.equals(this.commute, updatableActivity.commute) &&
        Objects.equals(this.trainer, updatableActivity.trainer) &&
        Objects.equals(this.description, updatableActivity.description) &&
        Objects.equals(this.name, updatableActivity.name) &&
        Objects.equals(this.type, updatableActivity.type) &&
        Objects.equals(this.gearId, updatableActivity.gearId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commute, trainer, description, name, type, gearId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatableActivity {\n");
    
    sb.append("    commute: ").append(toIndentedString(commute)).append("\n");
    sb.append("    trainer: ").append(toIndentedString(trainer)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    gearId: ").append(toIndentedString(gearId)).append("\n");
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

