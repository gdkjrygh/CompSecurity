// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.ups;

import android.util.Log;
import com.weather.util.ObjectUtils;
import com.weather.util.StringUtils;
import com.weather.util.date.Day;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.weather.dal2.ups:
//            UserDetails

public class Demographics
{
    public static final class AgeRange extends Enum
    {

        private static final AgeRange $VALUES[];
        public static final AgeRange AGE_RANGE_13_TO_17;
        public static final AgeRange AGE_RANGE_18_TO_24;
        public static final AgeRange AGE_RANGE_25_TO_34;
        public static final AgeRange AGE_RANGE_35_TO_44;
        public static final AgeRange AGE_RANGE_45_TO_54;
        public static final AgeRange AGE_RANGE_55_TO_64;
        public static final AgeRange AGE_RANGE_65_PLUS;
        public static final AgeRange AGE_RANGE_UNDER;
        private final String ageRange;
        private final int maxAge;
        private final int minAge;

        public static AgeRange lookupRange(int i)
        {
            AgeRange aagerange[] = values();
            int k = aagerange.length;
            for (int j = 0; j < k; j++)
            {
                AgeRange agerange = aagerange[j];
                if (agerange.minAge <= i && agerange.maxAge >= i)
                {
                    return agerange;
                }
            }

            throw new IllegalArgumentException("Age does not match");
        }

        public static AgeRange lookupRange(String s)
        {
            AgeRange aagerange[] = values();
            int j = aagerange.length;
            for (int i = 0; i < j; i++)
            {
                AgeRange agerange = aagerange[i];
                if (agerange.ageRange.equals(s))
                {
                    return agerange;
                }
            }

            return null;
        }

        public static AgeRange valueOf(String s)
        {
            return (AgeRange)Enum.valueOf(com/weather/dal2/ups/Demographics$AgeRange, s);
        }

        public static AgeRange[] values()
        {
            return (AgeRange[])$VALUES.clone();
        }

        public String toString()
        {
            return ageRange;
        }

        static 
        {
            AGE_RANGE_UNDER = new AgeRange("AGE_RANGE_UNDER", 0, "under13", 0, 12);
            AGE_RANGE_13_TO_17 = new AgeRange("AGE_RANGE_13_TO_17", 1, "13-17", 13, 17);
            AGE_RANGE_18_TO_24 = new AgeRange("AGE_RANGE_18_TO_24", 2, "18-24", 18, 24);
            AGE_RANGE_25_TO_34 = new AgeRange("AGE_RANGE_25_TO_34", 3, "25-34", 25, 34);
            AGE_RANGE_35_TO_44 = new AgeRange("AGE_RANGE_35_TO_44", 4, "35-44", 35, 44);
            AGE_RANGE_45_TO_54 = new AgeRange("AGE_RANGE_45_TO_54", 5, "45-54", 45, 54);
            AGE_RANGE_55_TO_64 = new AgeRange("AGE_RANGE_55_TO_64", 6, "55-64", 55, 64);
            AGE_RANGE_65_PLUS = new AgeRange("AGE_RANGE_65_PLUS", 7, "65plus", 65, 0x7fffffff);
            $VALUES = (new AgeRange[] {
                AGE_RANGE_UNDER, AGE_RANGE_13_TO_17, AGE_RANGE_18_TO_24, AGE_RANGE_25_TO_34, AGE_RANGE_35_TO_44, AGE_RANGE_45_TO_54, AGE_RANGE_55_TO_64, AGE_RANGE_65_PLUS
            });
        }

        private AgeRange(String s, int i, String s1, int j, int k)
        {
            super(s, i);
            ageRange = s1;
            minAge = j;
            maxAge = k;
        }
    }

    public static final class Gender extends Enum
    {

        private static final Gender $VALUES[];
        public static final Gender GENDER_FEMALE;
        public static final Gender GENDER_MALE;
        private final String gender;

        public static Gender valueOf(String s)
        {
            return (Gender)Enum.valueOf(com/weather/dal2/ups/Demographics$Gender, s);
        }

        public static Gender[] values()
        {
            return (Gender[])$VALUES.clone();
        }

        public String toString()
        {
            return gender;
        }

        static 
        {
            GENDER_MALE = new Gender("GENDER_MALE", 0, "M");
            GENDER_FEMALE = new Gender("GENDER_FEMALE", 1, "F");
            $VALUES = (new Gender[] {
                GENDER_MALE, GENDER_FEMALE
            });
        }

        private Gender(String s, int i, String s1)
        {
            super(s, i);
            gender = s1;
        }
    }


    public static final String AGE_RANGE = "ageRange";
    public static final String CABLE_PROVIDER = "cableProvider";
    public static final String DATE_OF_BIRTH = "dob";
    public static final String EMAIL = "email";
    public static final String FIRST_NAME = "firstName";
    public static final String GENDER = "gender";
    public static final String LAST_NAME = "lastName";
    public static final String USERNAME = "userName";
    private String age;
    private String ageRange;
    private String cableProvider;
    private String dateOfBirth;
    private String firstName;
    private String gender;
    private String lastName;
    String twcAccountEmail;
    private String userName;

    public Demographics()
    {
    }

    public Demographics(String s)
        throws JSONException
    {
        Day day = null;
        super();
        JSONObject jsonobject = new JSONObject(s);
        userName = jsonobject.optString("userName", null);
        gender = jsonobject.optString("gender", null);
        ageRange = jsonobject.optString("ageRange", null);
        dateOfBirth = jsonobject.optString("dob", null);
        twcAccountEmail = jsonobject.optString("email", null);
        firstName = jsonobject.optString("firstName", null);
        lastName = jsonobject.optString("lastName", null);
        cableProvider = jsonobject.optString("cableProvider", null);
        if (dateOfBirth != null)
        {
            day = Day.valueOf(dateOfBirth);
        }
        if (day != null)
        {
            age = String.valueOf(day.getAge());
        }
        Log.d("demographics", (new StringBuilder()).append("fyz demographics retrieval success: ").append(s).toString());
    }

    public Demographics(String s, AgeRange agerange, Gender gender1)
    {
        setDemographics(s, agerange, gender1);
    }

    public Demographics(String s, Day day, AgeRange agerange, Gender gender1)
    {
        setDemographics(s, day, agerange, gender1, null);
    }

    public Demographics(String s, String s1, String s2, String s3)
    {
        setDemographics(s, getAgeRange(s1), getGender(s2));
        if (s3 != null)
        {
            twcAccountEmail = s3;
        }
    }

    public Demographics(String s, String s1, String s2, String s3, String s4, String s5)
    {
        if (s1 == null)
        {
            s1 = null;
        } else
        {
            s1 = Day.valueOf(s1);
        }
        setDemographics(s, s1, getAgeRange(s2), getGender(s3), s5);
        if (s4 != null)
        {
            twcAccountEmail = s4;
        }
    }

    public static AgeRange getAgeRange(String s)
    {
        AgeRange agerange;
        Object obj;
        obj = null;
        agerange = obj;
        if (s == null) goto _L2; else goto _L1
_L1:
        AgeRange aagerange[];
        int i;
        int j;
        aagerange = AgeRange.values();
        j = aagerange.length;
        i = 0;
_L6:
        agerange = obj;
        if (i >= j) goto _L2; else goto _L3
_L3:
        agerange = aagerange[i];
        if (!s.equals(agerange.toString())) goto _L4; else goto _L2
_L2:
        return agerange;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static Gender getGender(String s)
    {
        Object obj = null;
        Gender gender1 = obj;
        if (s != null)
        {
            if (s.equals(Gender.GENDER_FEMALE.toString()))
            {
                gender1 = Gender.GENDER_FEMALE;
            } else
            {
                gender1 = obj;
                if (s.equals(Gender.GENDER_MALE.toString()))
                {
                    return Gender.GENDER_MALE;
                }
            }
        }
        return gender1;
    }

    private void setDemographics(String s, AgeRange agerange, Gender gender1)
    {
        userName = s;
        if (gender1 != null)
        {
            gender = gender1.toString();
        }
        if (agerange != null)
        {
            ageRange = agerange.toString();
        }
    }

    private void setDemographics(String s, Day day, AgeRange agerange, Gender gender1, String s1)
    {
        userName = s;
        cableProvider = s1;
        if (gender1 != null)
        {
            gender = gender1.toString();
        }
        if (agerange != null)
        {
            ageRange = agerange.toString();
        }
        setDateOfBirth(day);
    }

    public boolean equals(Demographics demographics)
    {
        return demographics != null && StringUtils.areEqual(demographics.getTwcAccountEmail(), getTwcAccountEmail()) && StringUtils.areEqual(demographics.getGender(), getGender()) && StringUtils.areEqual(demographics.getCableProvider(), getCableProvider()) && StringUtils.areEqual(demographics.getFullName(), getFullName()) && StringUtils.areEqual(demographics.getDateOfBirth(), getDateOfBirth());
    }

    public boolean equals(Object obj)
    {
        return obj != null && (obj == this || (obj instanceof Demographics) && equals((Demographics)obj));
    }

    public String getAge()
    {
        return age;
    }

    public String getAgeRange()
    {
        return ageRange;
    }

    public String getCableProvider()
    {
        return cableProvider;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getFullName()
    {
        String s;
        String s1;
        if (StringUtils.isBlank(firstName))
        {
            s = "";
        } else
        {
            s = firstName;
        }
        if (StringUtils.isBlank(lastName))
        {
            s1 = "";
        } else
        {
            s1 = lastName;
        }
        if (StringUtils.isBlank(s))
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s).append(' ').append(s1).toString();
        }
    }

    public String getGender()
    {
        return gender;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getTwcAccountEmail()
    {
        return twcAccountEmail;
    }

    public String getUserName()
    {
        return userName;
    }

    public int hashCode()
    {
        return ObjectUtils.getHashCodeFrom(getFirstName(), new Object[] {
            getLastName(), getGender(), getDateOfBirth(), getTwcAccountEmail(), getCableProvider()
        });
    }

    public void setCableProvider(String s)
    {
        cableProvider = s;
    }

    public void setDateOfBirth(Day day)
    {
        if (day == null)
        {
            return;
        } else
        {
            dateOfBirth = day.toString();
            int i = day.getAge();
            ageRange = AgeRange.lookupRange(day.getAge()).toString();
            age = String.valueOf(i);
            return;
        }
    }

    public void setFirstName(String s)
    {
        firstName = s;
    }

    public void setGender(String s)
    {
        gender = s;
    }

    public void setLastName(String s)
    {
        lastName = s;
    }

    public void setTwcAccountEmail(String s)
    {
        twcAccountEmail = s;
    }

    public void setUserDetails(UserDetails userdetails)
    {
        firstName = userdetails.getFirstName();
        lastName = userdetails.getLastName();
        twcAccountEmail = userdetails.getEmail();
    }

    public void setUserName(String s)
    {
        userName = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Demographics{userName='").append(userName).append('\'').append(", gender='").append(gender).append('\'').append(", ageRange='").append(ageRange).append('\'').append(", dateOfBirth='").append(dateOfBirth).append('\'').append(", age='").append(age).append('\'').append(", firstName='").append(firstName).append('\'').append(", lastName='").append(lastName).append('\'').append(", cableProvider='").append(cableProvider).append('\'').append(", twcAccountEmail='").append(twcAccountEmail).append('\'').append('}').toString();
    }
}
