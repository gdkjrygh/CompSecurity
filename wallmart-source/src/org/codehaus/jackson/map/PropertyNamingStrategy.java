// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.codehaus.jackson.map;

import org.codehaus.jackson.map.introspect.AnnotatedField;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.introspect.AnnotatedParameter;

// Referenced classes of package org.codehaus.jackson.map:
//            MapperConfig

public abstract class PropertyNamingStrategy
{
    public static class LowerCaseWithUnderscoresStrategy extends PropertyNamingStrategyBase
    {

        public String translate(String s)
        {
            if (s != null) goto _L2; else goto _L1
_L1:
            return s;
_L2:
            int j1 = s.length();
            StringBuilder stringbuilder = new StringBuilder(j1 * 2);
            int i = 0;
            int l = 0;
            int k = 0;
            while (k < j1) 
            {
label0:
                {
                    char c = s.charAt(k);
                    int j;
                    int i1;
                    if (k <= 0)
                    {
                        i1 = i;
                        j = l;
                        if (c == '_')
                        {
                            break label0;
                        }
                    }
                    if (Character.isUpperCase(c))
                    {
                        j = i;
                        if (l == 0)
                        {
                            j = i;
                            if (i > 0)
                            {
                                j = i;
                                if (stringbuilder.charAt(i - 1) != '_')
                                {
                                    stringbuilder.append('_');
                                    j = i + 1;
                                }
                            }
                        }
                        c = Character.toLowerCase(c);
                        i = 1;
                    } else
                    {
                        boolean flag = false;
                        j = i;
                        i = ((flag) ? 1 : 0);
                    }
                    stringbuilder.append(c);
                    i1 = j + 1;
                    j = i;
                }
                k++;
                i = i1;
                l = j;
            }
            if (i > 0)
            {
                return stringbuilder.toString();
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public LowerCaseWithUnderscoresStrategy()
        {
        }
    }

    public static abstract class PropertyNamingStrategyBase extends PropertyNamingStrategy
    {

        public String nameForConstructorParameter(MapperConfig mapperconfig, AnnotatedParameter annotatedparameter, String s)
        {
            return translate(s);
        }

        public String nameForField(MapperConfig mapperconfig, AnnotatedField annotatedfield, String s)
        {
            return translate(s);
        }

        public String nameForGetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
        {
            return translate(s);
        }

        public String nameForSetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
        {
            return translate(s);
        }

        public abstract String translate(String s);

        public PropertyNamingStrategyBase()
        {
        }
    }


    public static final PropertyNamingStrategy CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES = new LowerCaseWithUnderscoresStrategy();

    public PropertyNamingStrategy()
    {
    }

    public String nameForConstructorParameter(MapperConfig mapperconfig, AnnotatedParameter annotatedparameter, String s)
    {
        return s;
    }

    public String nameForField(MapperConfig mapperconfig, AnnotatedField annotatedfield, String s)
    {
        return s;
    }

    public String nameForGetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
    {
        return s;
    }

    public String nameForSetterMethod(MapperConfig mapperconfig, AnnotatedMethod annotatedmethod, String s)
    {
        return s;
    }

}
