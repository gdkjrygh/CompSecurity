// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzi

public final class Field
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    public static final Field FIELD_ACCURACY = zzcI("accuracy");
    public static final Field FIELD_ACTIVITY = zzcH("activity");
    public static final Field FIELD_ALTITUDE = zzcI("altitude");
    public static final Field FIELD_AVERAGE = zzcI("average");
    public static final Field FIELD_BPM = zzcI("bpm");
    public static final Field FIELD_CALORIES = zzcI("calories");
    public static final Field FIELD_CIRCUMFERENCE = zzcI("circumference");
    public static final Field FIELD_CONFIDENCE = zzcI("confidence");
    public static final Field FIELD_DISTANCE = zzcI("distance");
    public static final Field FIELD_DURATION = zzcH("duration");
    public static final Field FIELD_EXERCISE = zzcJ("exercise");
    public static final Field FIELD_FOOD_ITEM = zzcJ("food_item");
    public static final Field FIELD_HEIGHT = zzcI("height");
    public static final Field FIELD_HIGH_LATITUDE = zzcI("high_latitude");
    public static final Field FIELD_HIGH_LONGITUDE = zzcI("high_longitude");
    public static final Field FIELD_LATITUDE = zzcI("latitude");
    public static final Field FIELD_LONGITUDE = zzcI("longitude");
    public static final Field FIELD_LOW_LATITUDE = zzcI("low_latitude");
    public static final Field FIELD_LOW_LONGITUDE = zzcI("low_longitude");
    public static final Field FIELD_MAX = zzcI("max");
    public static final Field FIELD_MEAL_TYPE = zzcH("meal_type");
    public static final Field FIELD_MIN = zzcI("min");
    public static final Field FIELD_NUM_SEGMENTS = zzcH("num_segments");
    public static final Field FIELD_NUTRIENTS = zzcK("nutrients");
    public static final Field FIELD_PERCENTAGE = zzcI("percentage");
    public static final Field FIELD_REPETITIONS = zzcH("repetitions");
    public static final Field FIELD_RESISTANCE = zzcI("resistance");
    public static final Field FIELD_RESISTANCE_TYPE = zzcH("resistance_type");
    public static final Field FIELD_REVOLUTIONS = zzcH("revolutions");
    public static final Field FIELD_RPM = zzcI("rpm");
    public static final Field FIELD_SPEED = zzcI("speed");
    public static final Field FIELD_STEPS = zzcH("steps");
    public static final Field FIELD_WATTS = zzcI("watts");
    public static final Field FIELD_WEIGHT = zzcI("weight");
    public static final int FORMAT_FLOAT = 2;
    public static final int FORMAT_INT32 = 1;
    public static final int FORMAT_MAP = 4;
    public static final int FORMAT_STRING = 3;
    public static final int MEAL_TYPE_BREAKFAST = 1;
    public static final int MEAL_TYPE_DINNER = 3;
    public static final int MEAL_TYPE_LUNCH = 2;
    public static final int MEAL_TYPE_SNACK = 4;
    public static final int MEAL_TYPE_UNKNOWN = 0;
    public static final String NUTRIENT_CALCIUM = "calcium";
    public static final String NUTRIENT_CALORIES = "calories";
    public static final String NUTRIENT_CHOLESTEROL = "cholesterol";
    public static final String NUTRIENT_DIETARY_FIBER = "dietary_fiber";
    public static final String NUTRIENT_IRON = "iron";
    public static final String NUTRIENT_MONOUNSATURATED_FAT = "fat.monounsaturated";
    public static final String NUTRIENT_POLYUNSATURATED_FAT = "fat.polyunsaturated";
    public static final String NUTRIENT_POTASSIUM = "potassium";
    public static final String NUTRIENT_PROTEIN = "protein";
    public static final String NUTRIENT_SATURATED_FAT = "fat.saturated";
    public static final String NUTRIENT_SODIUM = "sodium";
    public static final String NUTRIENT_SUGAR = "sugar";
    public static final String NUTRIENT_TOTAL_CARBS = "carbs.total";
    public static final String NUTRIENT_TOTAL_FAT = "fat.total";
    public static final String NUTRIENT_TRANS_FAT = "fat.trans";
    public static final String NUTRIENT_UNSATURATED_FAT = "fat.unsaturated";
    public static final String NUTRIENT_VITAMIN_A = "vitamin_a";
    public static final String NUTRIENT_VITAMIN_C = "vitamin_c";
    public static final int RESISTANCE_TYPE_BARBELL = 1;
    public static final int RESISTANCE_TYPE_BODY = 6;
    public static final int RESISTANCE_TYPE_CABLE = 2;
    public static final int RESISTANCE_TYPE_DUMBBELL = 3;
    public static final int RESISTANCE_TYPE_KETTLEBELL = 4;
    public static final int RESISTANCE_TYPE_MACHINE = 5;
    public static final int RESISTANCE_TYPE_UNKNOWN = 0;
    public static final Field zzakA = zzcI("z");
    public static final Field zzakv = zzcK("activity_confidences");
    public static final Field zzakw = zzcI("elevation.gain");
    public static final Field zzakx = zzcH("edge_type");
    public static final Field zzaky = zzcI("x");
    public static final Field zzakz = zzcI("y");
    private final String mName;
    private final int zzCY;
    private final int zzakB;

    Field(int i, String s, int j)
    {
        zzCY = i;
        mName = (String)zzu.zzu(s);
        zzakB = j;
    }

    private Field(String s, int i)
    {
        this(1, s, i);
    }

    private boolean zza(Field field)
    {
        return mName.equals(field.mName) && zzakB == field.zzakB;
    }

    private static Field zzcH(String s)
    {
        return new Field(s, 1);
    }

    private static Field zzcI(String s)
    {
        return new Field(s, 2);
    }

    private static Field zzcJ(String s)
    {
        return new Field(s, 3);
    }

    private static Field zzcK(String s)
    {
        return new Field(s, 4);
    }

    public static Field zzn(String s, int i)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 39: default 328
    //                   -2131707655: 510
    //                   -1992012396: 655
    //                   -1655966961: 524
    //                   -1569430471: 872
    //                   -1439978388: 763
    //                   -1221029593: 716
    //                   -1110756780: 701
    //                   -921832806: 903
    //                   -791592328: 1038
    //                   -631448035: 566
    //                   -626344110: 747
    //                   -619868540: 809
    //                   -494782871: 731
    //                   -437053898: 841
    //                   -277306353: 610
    //                   -266093204: 888
    //                   -168965370: 595
    //                   -126538880: 948
    //                   120: 1053
    //                   121: 1069
    //                   122: 1085
    //                   97759: 581
    //                   107876: 825
    //                   108114: 856
    //                   113135: 978
    //                   109641799: 993
    //                   109761319: 1008
    //                   112903913: 1023
    //                   137365935: 778
    //                   198162679: 793
    //                   224520316: 670
    //                   288459765: 640
    //                   811264586: 963
    //                   829251210: 625
    //                   984367650: 918
    //                   1857734768: 552
    //                   1863800889: 933
    //                   2036550306: 538
    //                   2056323544: 686;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40
_L1:
        break; /* Loop/switch isn't completed */
_L22:
        break MISSING_BLOCK_LABEL_1085;
_L41:
        switch (byte0)
        {
        default:
            return new Field(s, i);

        case 0: // '\0'
            return FIELD_ACCURACY;

        case 1: // '\001'
            return FIELD_ACTIVITY;

        case 2: // '\002'
            return FIELD_ALTITUDE;

        case 3: // '\003'
            return zzakw;

        case 4: // '\004'
            return FIELD_AVERAGE;

        case 5: // '\005'
            return FIELD_BPM;

        case 6: // '\006'
            return FIELD_CALORIES;

        case 7: // '\007'
            return FIELD_CIRCUMFERENCE;

        case 8: // '\b'
            return FIELD_CONFIDENCE;

        case 9: // '\t'
            return FIELD_DISTANCE;

        case 10: // '\n'
            return FIELD_DURATION;

        case 11: // '\013'
            return zzakx;

        case 12: // '\f'
            return FIELD_EXERCISE;

        case 13: // '\r'
            return FIELD_FOOD_ITEM;

        case 14: // '\016'
            return FIELD_HEIGHT;

        case 15: // '\017'
            return FIELD_HIGH_LATITUDE;

        case 16: // '\020'
            return FIELD_HIGH_LONGITUDE;

        case 17: // '\021'
            return FIELD_LATITUDE;

        case 18: // '\022'
            return FIELD_LONGITUDE;

        case 19: // '\023'
            return FIELD_LOW_LATITUDE;

        case 20: // '\024'
            return FIELD_LOW_LONGITUDE;

        case 21: // '\025'
            return FIELD_MAX;

        case 22: // '\026'
            return FIELD_MEAL_TYPE;

        case 23: // '\027'
            return FIELD_MIN;

        case 24: // '\030'
            return FIELD_NUM_SEGMENTS;

        case 25: // '\031'
            return FIELD_NUTRIENTS;

        case 26: // '\032'
            return FIELD_PERCENTAGE;

        case 27: // '\033'
            return FIELD_REPETITIONS;

        case 28: // '\034'
            return FIELD_RESISTANCE;

        case 29: // '\035'
            return FIELD_RESISTANCE_TYPE;

        case 30: // '\036'
            return FIELD_REVOLUTIONS;

        case 31: // '\037'
            return FIELD_RPM;

        case 32: // ' '
            return FIELD_SPEED;

        case 33: // '!'
            return FIELD_STEPS;

        case 34: // '"'
            return FIELD_WATTS;

        case 35: // '#'
            return FIELD_WEIGHT;

        case 36: // '$'
            return zzaky;

        case 37: // '%'
            return zzakz;

        case 38: // '&'
            return zzakA;
        }
_L2:
        if (s.equals("accuracy"))
        {
            byte0 = 0;
        }
          goto _L41
_L4:
        if (s.equals("activity"))
        {
            byte0 = 1;
        }
          goto _L41
_L39:
        if (s.equals("altitude"))
        {
            byte0 = 2;
        }
          goto _L41
_L37:
        if (s.equals("elevation.gain"))
        {
            byte0 = 3;
        }
          goto _L41
_L11:
        if (s.equals("average"))
        {
            byte0 = 4;
        }
          goto _L41
_L23:
        if (s.equals("bpm"))
        {
            byte0 = 5;
        }
          goto _L41
_L18:
        if (s.equals("calories"))
        {
            byte0 = 6;
        }
          goto _L41
_L16:
        if (s.equals("circumference"))
        {
            byte0 = 7;
        }
          goto _L41
_L35:
        if (s.equals("confidence"))
        {
            byte0 = 8;
        }
          goto _L41
_L33:
        if (s.equals("distance"))
        {
            byte0 = 9;
        }
          goto _L41
_L3:
        if (s.equals("duration"))
        {
            byte0 = 10;
        }
          goto _L41
_L32:
        if (s.equals("edge_type"))
        {
            byte0 = 11;
        }
          goto _L41
_L40:
        if (s.equals("exercise"))
        {
            byte0 = 12;
        }
          goto _L41
_L8:
        if (s.equals("food_item"))
        {
            byte0 = 13;
        }
          goto _L41
_L7:
        if (s.equals("height"))
        {
            byte0 = 14;
        }
          goto _L41
_L14:
        if (s.equals("high_latitude"))
        {
            byte0 = 15;
        }
          goto _L41
_L12:
        if (s.equals("high_longitude"))
        {
            byte0 = 16;
        }
          goto _L41
_L6:
        if (s.equals("latitude"))
        {
            byte0 = 17;
        }
          goto _L41
_L30:
        if (s.equals("longitude"))
        {
            byte0 = 18;
        }
          goto _L41
_L31:
        if (s.equals("low_latitude"))
        {
            byte0 = 19;
        }
          goto _L41
_L13:
        if (s.equals("low_longitude"))
        {
            byte0 = 20;
        }
          goto _L41
_L24:
        if (s.equals("max"))
        {
            byte0 = 21;
        }
          goto _L41
_L15:
        if (s.equals("meal_type"))
        {
            byte0 = 22;
        }
          goto _L41
_L25:
        if (s.equals("min"))
        {
            byte0 = 23;
        }
          goto _L41
_L5:
        if (s.equals("num_segments"))
        {
            byte0 = 24;
        }
          goto _L41
_L17:
        if (s.equals("nutrients"))
        {
            byte0 = 25;
        }
          goto _L41
_L9:
        if (s.equals("percentage"))
        {
            byte0 = 26;
        }
          goto _L41
_L36:
        if (s.equals("repetitions"))
        {
            byte0 = 27;
        }
          goto _L41
_L38:
        if (s.equals("resistance"))
        {
            byte0 = 28;
        }
          goto _L41
_L19:
        if (s.equals("resistance_type"))
        {
            byte0 = 29;
        }
          goto _L41
_L34:
        if (s.equals("revolutions"))
        {
            byte0 = 30;
        }
          goto _L41
_L26:
        if (s.equals("rpm"))
        {
            byte0 = 31;
        }
          goto _L41
_L27:
        if (s.equals("speed"))
        {
            byte0 = 32;
        }
          goto _L41
_L28:
        if (s.equals("steps"))
        {
            byte0 = 33;
        }
          goto _L41
_L29:
        if (s.equals("watts"))
        {
            byte0 = 34;
        }
          goto _L41
_L10:
        if (s.equals("weight"))
        {
            byte0 = 35;
        }
          goto _L41
_L20:
        if (s.equals("x"))
        {
            byte0 = 36;
        }
          goto _L41
_L21:
        if (s.equals("y"))
        {
            byte0 = 37;
        }
          goto _L41
        if (s.equals("z"))
        {
            byte0 = 38;
        }
          goto _L41
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof Field) && zza((Field)obj);
    }

    public int getFormat()
    {
        return zzakB;
    }

    public String getName()
    {
        return mName;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return mName.hashCode();
    }

    public String toString()
    {
        String s1 = mName;
        String s;
        if (zzakB == 1)
        {
            s = "i";
        } else
        {
            s = "f";
        }
        return String.format("%s(%s)", new Object[] {
            s1, s
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

}
