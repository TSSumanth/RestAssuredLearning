package taskpojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Task 
{
	private String ActualFinishDate;
	private String ActualHours;
	private String ActualStartDate;
	private String CurrentEffort;
	private String CurrentFinishDate;
	private String CurrentStartDate;
	private String GateFlag;
	private String ElementType;
	private String Name;
	private String MilestoneFlag;
	private String GateStatusCode;
	private String PercentComplete;
	private String PlannedAllocation;
	private String PlannedDuration;
	private String PlannedEffort;
	private String PlannedFinishDate;
	private String PlannedStartDate;
	private String ScheduleTypeCode;
	private String ConstraintType;
	private String ConstraintDate;
	private String RequirementId;
	private String SprintId;
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String TaskId;
	
	@JsonProperty("TaskId")
	public String getTaskId() {
		return TaskId;
	}
	
	@JsonProperty("TaskId")
	public void setTaskId(String taskId) {
		TaskId = taskId;
	}
	
	@JsonProperty("ActualFinishDate")
	public String getActualFinishDate() {
		return ActualFinishDate;
	}
	
	@JsonProperty("ActualFinishDate")
	public void setActualFinishDate(String actualFinishDate) {
		ActualFinishDate = actualFinishDate;
	}
	
	@JsonProperty("ActualHours")
	public String getActualHours() {
		return ActualHours;
	}
	@JsonProperty("ActualHours")
	public void setActualHours(String actualHours) {
		ActualHours = actualHours;
	}
	@JsonProperty("ActualStartDate")
	public String getActualStartDate() {
		return ActualStartDate;
	}
	@JsonProperty("ActualStartDate")
	public void setActualStartDate(String actualStartDate) {
		ActualStartDate = actualStartDate;
	}
	@JsonProperty("CurrentEffort")
	public String getCurrentEffort() {
		return CurrentEffort;
	}
	@JsonProperty("CurrentEffort")
	public void setCurrentEffort(String currentEffort) {
		CurrentEffort = currentEffort;
	}
	@JsonProperty("CurrentFinishDate")
	public String getCurrentFinishDate() {
		return CurrentFinishDate;
	}
	@JsonProperty("CurrentFinishDate")
	public void setCurrentFinishDate(String currentFinishDate) {
		CurrentFinishDate = currentFinishDate;
	}
	@JsonProperty("CurrentStartDate")
	public String getCurrentStartDate() {
		return CurrentStartDate;
	}
	@JsonProperty("CurrentStartDate")
	public void setCurrentStartDate(String currentStartDate) {
		CurrentStartDate = currentStartDate;
	}
	@JsonProperty("GateFlag")
	public String getGateFlag() {
		return GateFlag;
	}
	@JsonProperty("GateFlag")
	public void setGateFlag(String gateFlag) {
		GateFlag = gateFlag;
	}
	@JsonProperty("ElementType")
	public String getElementType() {
		return ElementType;
	}
	@JsonProperty("ElementType")
	public void setElementType(String elementType) {
		ElementType = elementType;
	}
	@JsonProperty("Name")
	public String getName() {
		return Name;
	}
	@JsonProperty("Name")
	public void setName(String name) {
		Name = name;
	}
	@JsonProperty("MilestoneFlag")
	public String getMilestoneFlag() {
		return MilestoneFlag;
	}
	@JsonProperty("MilestoneFlag")
	public void setMilestoneFlag(String milestoneFlag) {
		MilestoneFlag = milestoneFlag;
	}
	@JsonProperty("GateStatusCode")
	public String getGateStatusCode() {
		return GateStatusCode;
	}
	@JsonProperty("GateStatusCode")
	public void setGateStatusCode(String gateStatusCode) {
		GateStatusCode = gateStatusCode;
	}
	@JsonProperty("PercentComplete")
	public String getPercentComplete() {
		return PercentComplete;
	}
	@JsonProperty("PercentComplete")
	public void setPercentComplete(String percentComplete) {
		PercentComplete = percentComplete;
	}
	@JsonProperty("PlannedAllocation")
	public String getPlannedAllocation() {
		return PlannedAllocation;
	}
	@JsonProperty("PlannedAllocation")
	public void setPlannedAllocation(String plannedAllocation) {
		PlannedAllocation = plannedAllocation;
	}
	@JsonProperty("PlannedDuration")
	public String getPlannedDuration() {
		return PlannedDuration;
	}
	@JsonProperty("PlannedDuration")
	public void setPlannedDuration(String plannedDuration) {
		PlannedDuration = plannedDuration;
	}
	@JsonProperty("PlannedEffort")
	public String getPlannedEffort() {
		return PlannedEffort;
	}
	@JsonProperty("PlannedEffort")
	public void setPlannedEffort(String plannedEffort) {
		PlannedEffort = plannedEffort;
	}
	@JsonProperty("PlannedFinishDate")
	public String getPlannedFinishDate() {
		return PlannedFinishDate;
	}
	@JsonProperty("PlannedFinishDate")
	public void setPlannedFinishDate(String plannedFinishDate) {
		PlannedFinishDate = plannedFinishDate;
	}
	@JsonProperty("PlannedStartDate")
	public String getPlannedStartDate() {
		return PlannedStartDate;
	}
	@JsonProperty("PlannedStartDate")
	public void setPlannedStartDate(String plannedStartDate) {
		PlannedStartDate = plannedStartDate;
	}
	@JsonProperty("ScheduleTypeCode")
	public String getScheduleTypeCode() {
		return ScheduleTypeCode;
	}
	@JsonProperty("ScheduleTypeCode")
	public void setScheduleTypeCode(String scheduleTypeCode) {
		ScheduleTypeCode = scheduleTypeCode;
	}
	@JsonProperty("ConstraintType")
	public String getConstraintType() {
		return ConstraintType;
	}
	@JsonProperty("ConstraintType")
	public void setConstraintType(String constraintType) {
		ConstraintType = constraintType;
	}
	@JsonProperty("ConstraintDate")
	public String getConstraintDate() {
		return ConstraintDate;
	}
	@JsonProperty("ConstraintDate")
	public void setConstraintDate(String constraintDate) {
		ConstraintDate = constraintDate;
	}
	@JsonProperty("RequirementId")
	public String getRequirementId() {
		return RequirementId;
	}
	@JsonProperty("RequirementId")
	public void setRequirementId(String requirementId) {
		RequirementId = requirementId;
	}
	@JsonProperty("SprintId")
	public String getSprintId() {
		return SprintId;
	}
	@JsonProperty("SprintId")
	public void setSprintId(String sprintId) {
		SprintId = sprintId;
	}
}
