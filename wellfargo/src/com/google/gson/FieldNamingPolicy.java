// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson;


// Referenced classes of package com.google.gson:
//            FieldNamingStrategy

public abstract class FieldNamingPolicy extends Enum
    implements FieldNamingStrategy
{

    private static final FieldNamingPolicy $VALUES[];
    public static final FieldNamingPolicy IDENTITY;
    public static final FieldNamingPolicy LOWER_CASE_WITH_DASHES;
    public static final FieldNamingPolicy LOWER_CASE_WITH_UNDERSCORES;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE;
    public static final FieldNamingPolicy UPPER_CAMEL_CASE_WITH_SPACES;

    private FieldNamingPolicy(String s, int i)
    {
        super(s, i);
    }

    FieldNamingPolicy(String s, int i, _cls1 _pcls1)
    {
        this(s, i);
    }

    private static String modifyString(char c, String s, int i)
    {
        if (i < s.length())
        {
            return (new StringBuilder()).append(c).append(s.substring(i)).toString();
        } else
        {
            return String.valueOf(c);
        }
    }

    private static String separateCamelCase(String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isUpperCase(c) && stringbuilder.length() != 0)
            {
                stringbuilder.append(s1);
            }
            stringbuilder.append(c);
        }

        return stringbuilder.toString();
    }

    private static String upperCaseFirstLetter(String s)
    {
        char c;
        StringBuilder stringbuilder;
        int i;
        stringbuilder = new StringBuilder();
        i = 0;
        c = s.charAt(0);
_L8:
        if (i < s.length() - 1 && !Character.isLetter(c)) goto _L2; else goto _L1
_L1:
        if (i != s.length()) goto _L4; else goto _L3
_L3:
        String s1 = stringbuilder.toString();
_L6:
        return s1;
_L2:
        stringbuilder.append(c);
        i++;
        c = s.charAt(i);
        continue; /* Loop/switch isn't completed */
_L4:
        s1 = s;
        if (Character.isUpperCase(c)) goto _L6; else goto _L5
_L5:
        return stringbuilder.append(modifyString(Character.toUpperCase(c), s, i + 1)).toString();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static FieldNamingPolicy valueOf(String s)
    {
        return (FieldNamingPolicy)Enum.valueOf(com/google/gson/FieldNamingPolicy, s);
    }

    public static FieldNamingPolicy[] values()
    {
        return (FieldNamingPolicy[])$VALUES.clone();
    }

    static 
    {
        IDENTITY = new _cls1("IDENTITY", 0);
        UPPER_CAMEL_CASE = new _cls2("UPPER_CAMEL_CASE", 1);
        UPPER_CAMEL_CASE_WITH_SPACES = new _cls3("UPPER_CAMEL_CASE_WITH_SPACES", 2);
        LOWER_CASE_WITH_UNDERSCORES = new _cls4("LOWER_CASE_WITH_UNDERSCORES", 3);
        LOWER_CASE_WITH_DASHES = new _cls5("LOWER_CASE_WITH_DASHES", 4);
        $VALUES = (new FieldNamingPolicy[] {
            IDENTITY, UPPER_CAMEL_CASE, UPPER_CAMEL_CASE_WITH_SPACES, LOWER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_DASHES
        });
    }



    private class _cls1 extends FieldNamingPolicy
    {

        public String translateName(Field field)
        {
            return field.getName();
        }

        _cls1(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls2 extends FieldNamingPolicy
    {

        public String translateName(Field field)
        {
            return FieldNamingPolicy.upperCaseFirstLetter(field.getName());
        }

        _cls2(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls3 extends FieldNamingPolicy
    {

        public String translateName(Field field)
        {
            return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(field.getName(), " "));
        }

        _cls3(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls4 extends FieldNamingPolicy
    {

        public String translateName(Field field)
        {
            return FieldNamingPolicy.separateCamelCase(field.getName(), "_").toLowerCase();
        }

        _cls4(String s, int i)
        {
            super(s, i, null);
        }
    }


    private class _cls5 extends FieldNamingPolicy
    {

        public String translateName(Field field)
        {
            return FieldNamingPolicy.separateCamelCase(field.getName(), "-").toLowerCase();
        }

        _cls5(String s, int i)
        {
            super(s, i, null);
        }
    }

}
