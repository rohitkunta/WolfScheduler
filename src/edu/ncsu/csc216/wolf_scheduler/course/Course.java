package edu.ncsu.csc216.wolf_scheduler.course;

/**
 * Contains the Course object and all it's respective fields and methods
 * @author Rohit Kunta
 */
public class Course 
{
	//CONSTANTS
	private static final int MIN_NAME_LENGTH = 5;
	private static final int MAX_NAME_LENGTH = 8;
	private static final int MIN_LETTER_COUNT = 1;
	private static final int MAX_LETTER_COUNT = 4;
	private static final int DIGIT_COUNT = 3;
			
	
	
	/** Course's name. */
	private String name;
	/** Course's title. */
	private String title;
	/** Course's section */
	private String section;
	/** Course's credit hours */
	private int credits;
	/** Course's instructor */
	private String instructorId;
	/** Course's meeting days */
	private String meetingDays;
	/** Course's starting time */
	private int startTime;
	/** Course's ending time */
	private int endTime;
	
	
	/**
	 * Constructs a Course object with values for all fields.
	 * @param name name of Course
	 * @param title title of Course
	 * @param section section of Course
	 * @param credits credit hours for Course
	 * @param instructorId instructor's unity id
	 * @param meetingDays meeting days for Course as series of chars
	 * @param startTime start time for Course
	 * @param endTime end time for Course
	 */
	public Course(String name, String title, String section, int credits, String instructorId, String meetingDays,
	        int startTime, int endTime) {
	    setName(name);
	    setTitle(title);
	    setSection(section);
	    setCredits(credits);
	    setInstructorId(instructorId);
	    setMeetingDays(meetingDays);
	    setStartTime(startTime);
	    setEndTime(endTime);
	}

	/**
	 * Creates a Course with the given name, title, section, credits, instructorId, and meetingDays for 
	 * courses that are arranged.
	 * @param name name of Course
	 * @param title title of Course
	 * @param section section of Course
	 * @param credits credit hours for Course
	 * @param instructorId instructor's unity id
	 * @param meetingDays meeting days for Course as series of chars
	 */
	public Course(String name, String title, String section, int credits, String instructorId, String meetingDays) {
	    this(name, title, section, credits, instructorId, meetingDays, 0, 0);
	}
	
	/**
	 * Returns the course's name
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the Course's name.  If the name is null, has a length less than 5 or more than 8,
	 * does not contain a space between letter characters and number characters, has less than 1
	 * or more than 4 letter characters, and not exactly three trailing digit characters, an
	 * IllegalArgumentException is thrown.
	 * @param name the name to set
	 * @throws IllegalArgumentException if the name parameter is invalid
	 */
	private void setName(String name) 
	{
		
		//Throw Exception if the name is null
		if (name == null)
			throw new IllegalArgumentException("Invalid Course Name");
		
		//Throw exception if the name is an empty string
	    //Throw exception if the name contains less than 5 character or greater than 8 characters
		if ((name.length() < MIN_NAME_LENGTH) || (name.length() > MAX_NAME_LENGTH))
				throw new IllegalArgumentException("Invalid course name.");
		
		//Check for pattern of L[LLL] NNN 
		int numLetters = 0;
		int numDigits = 0;
		boolean spaceFlag = false;
		
		for (int i = 0; i < name.length(); i++)
		{
			if ((' ' != name.charAt(i)))
			{
				if (Character.isLetter(name.charAt(i)))
				{
					numLetters++;
				}
				else if (' ' == name.charAt(i))
				{
					spaceFlag = true;
				}
				else
				{
					throw new IllegalArgumentException("Invalid course name.");
				}
					
			}
			else if (' ' == name.charAt(i))
			{
				if (Character.isDigit(name.charAt(i)))
				{
					numDigits++;
				}
				else
				{
					throw new IllegalArgumentException("Invalid Course Name");
				}
			}
		}
		
		
		//Check that the number of letter is correct
		if (numLetters < MIN_LETTER_COUNT || numLetters > MAX_LETTER_COUNT)
		{
			throw new IllegalArgumentException("Invalid course name.");
		}
		
		
		//Check that number of digits is correct
		if (numDigits != DIGIT_COUNT)
		{
			throw new IllegalArgumentException("Invalid course name.");
		}
		
		
		
		this.name = name;

	}
	
	/**
	 * Returns the course's title
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the course's title
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Returns the course's section 
	 * @return the section
	 */
	public String getSection() {
		return section;
	}
	
	/**
	 * Sets the course's section
	 * @param section the section to set
	 */
	public void setSection(String section) {
		this.section = section;
	}
	
	/**
	 * Returns the course's credits
	 * @return the credits
	 */
	public int getCredits() {
		return credits;
	}
	
	/**
	 * Sets the course's credits
	 * @param credits the credits to set
	 */
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	/**
	 * Returns the course's Instructor ID
	 * @return the instructorId
	 */
	public String getInstructorId() {
		return instructorId;
	}
	
	/**
	 * Sets the course's Instructor ID
	 * @param instructorId the instructorId to set
	 */
	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}
	
	/**
	 * Returns the course's Meeting days
	 * @return the meetingDays
	 */
	public String getMeetingDays() {
		return meetingDays;
	}
	
	/**
	 * Sets the course's Meeting days
	 * @param meetingDays the meetingDays to set
	 */
	public void setMeetingDays(String meetingDays) {
		this.meetingDays = meetingDays;
	}
	
	/**
	 * Returns the course's start time
	 * @return the startTime
	 */
	public int getStartTime() {
		return startTime;
	}

	/**
	 * Sets the course's start time
	 * @param startTime the startTime to set
	 */
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	
	/**
	 * Returns the course's end time
	 * @return the endTime
	 */
	public int getEndTime() {
		return endTime;
	}
	
	/**
	 * Sets the course's end time
	 * @param endTime the endTime to set
	 */
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}

	/**
	 * Generates a hashCode for Course using all fields
	 * @return hashCode for Course
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + credits;
		result = prime * result + endTime;
		result = prime * result + ((instructorId == null) ? 0 : instructorId.hashCode());
		result = prime * result + ((meetingDays == null) ? 0 : meetingDays.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((section == null) ? 0 : section.hashCode());
		result = prime * result + startTime;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	/**
	 * Compares a given object to this object for equality on all fields
	 * @param obj the Object to compare
	 * @return true if the objects are the same on all fields
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (credits != other.credits)
			return false;
		if (endTime != other.endTime)
			return false;
		if (instructorId == null) {
			if (other.instructorId != null)
				return false;
		} else if (!instructorId.equals(other.instructorId))
			return false;
		if (meetingDays == null) {
			if (other.meetingDays != null)
				return false;
		} else if (!meetingDays.equals(other.meetingDays))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (section == null) {
			if (other.section != null)
				return false;
		} else if (!section.equals(other.section))
			return false;
		if (startTime != other.startTime)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	/**
	 * Returns a comma separated value String of all Course fields.
	 * @return String representation of Course
	 */
	@Override
	public String toString() {
	    if ("A".equals(meetingDays))
	    {
	        return name + "," + title + "," + section + "," + credits + "," + instructorId + "," + meetingDays;
	    }
	    return name + "," + title + "," + section + "," + credits + "," + instructorId + "," + meetingDays + "," + startTime + "," + endTime; 
	}
	
	

	

}
