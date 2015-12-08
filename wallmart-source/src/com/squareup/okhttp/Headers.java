// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.HttpDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public final class Headers
{
    public static final class Builder
    {

        private final List namesAndValues = new ArrayList(20);

        private Builder addLenient(String s, String s1)
        {
            namesAndValues.add(s);
            namesAndValues.add(s1.trim());
            return this;
        }

        public Builder add(String s)
        {
            int i = s.indexOf(":");
            if (i == -1)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected header: ").append(s).toString());
            } else
            {
                return add(s.substring(0, i).trim(), s.substring(i + 1));
            }
        }

        public Builder add(String s, String s1)
        {
            if (s == null)
            {
                throw new IllegalArgumentException("name == null");
            }
            if (s1 == null)
            {
                throw new IllegalArgumentException("value == null");
            }
            if (s.length() == 0 || s.indexOf('\0') != -1 || s1.indexOf('\0') != -1)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected header: ").append(s).append(": ").append(s1).toString());
            } else
            {
                return addLenient(s, s1);
            }
        }

        Builder addLenient(String s)
        {
            int i = s.indexOf(":", 1);
            if (i != -1)
            {
                return addLenient(s.substring(0, i), s.substring(i + 1));
            }
            if (s.startsWith(":"))
            {
                return addLenient("", s.substring(1));
            } else
            {
                return addLenient("", s);
            }
        }

        public Headers build()
        {
            return new Headers(this);
        }

        public String get(String s)
        {
            for (int i = namesAndValues.size() - 2; i >= 0; i -= 2)
            {
                if (s.equalsIgnoreCase((String)namesAndValues.get(i)))
                {
                    return (String)namesAndValues.get(i + 1);
                }
            }

            return null;
        }

        public Builder removeAll(String s)
        {
            int j;
            for (int i = 0; i < namesAndValues.size(); i = j + 2)
            {
                j = i;
                if (s.equalsIgnoreCase((String)namesAndValues.get(i)))
                {
                    namesAndValues.remove(i);
                    namesAndValues.remove(i);
                    j = i - 2;
                }
            }

            return this;
        }

        public Builder set(String s, String s1)
        {
            removeAll(s);
            add(s, s1);
            return this;
        }


        public Builder()
        {
        }
    }


    private final String namesAndValues[];

    private Headers(Builder builder)
    {
        namesAndValues = (String[])builder.namesAndValues.toArray(new String[builder.namesAndValues.size()]);
    }


    private Headers(String as[])
    {
        namesAndValues = as;
    }

    private static String get(String as[], String s)
    {
        for (int i = as.length - 2; i >= 0; i -= 2)
        {
            if (s.equalsIgnoreCase(as[i]))
            {
                return as[i + 1];
            }
        }

        return null;
    }

    public static Headers of(Map map)
    {
        if (map == null)
        {
            throw new IllegalArgumentException("Expected map with header names and values");
        }
        String as[] = new String[map.size() * 2];
        int i = 0;
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            Object obj = (java.util.Map.Entry)map.next();
            if (((java.util.Map.Entry) (obj)).getKey() == null || ((java.util.Map.Entry) (obj)).getValue() == null)
            {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            String s = ((String)((java.util.Map.Entry) (obj)).getKey()).trim();
            obj = ((String)((java.util.Map.Entry) (obj)).getValue()).trim();
            if (s.length() == 0 || s.indexOf('\0') != -1 || ((String) (obj)).indexOf('\0') != -1)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected header: ").append(s).append(": ").append(((String) (obj))).toString());
            }
            as[i] = s;
            as[i + 1] = ((String) (obj));
            i += 2;
        }

        return new Headers(as);
    }

    public static transient Headers of(String as[])
    {
        if (as == null || as.length % 2 != 0)
        {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        as = (String[])as.clone();
        for (int i = 0; i < as.length; i++)
        {
            if (as[i] == null)
            {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            as[i] = as[i].trim();
        }

        for (int j = 0; j < as.length; j += 2)
        {
            String s = as[j];
            String s1 = as[j + 1];
            if (s.length() == 0 || s.indexOf('\0') != -1 || s1.indexOf('\0') != -1)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected header: ").append(s).append(": ").append(s1).toString());
            }
        }

        return new Headers(as);
    }

    public String get(String s)
    {
        return get(namesAndValues, s);
    }

    public Date getDate(String s)
    {
        s = get(s);
        if (s != null)
        {
            return HttpDate.parse(s);
        } else
        {
            return null;
        }
    }

    public String name(int i)
    {
        i *= 2;
        if (i < 0 || i >= namesAndValues.length)
        {
            return null;
        } else
        {
            return namesAndValues[i];
        }
    }

    public Set names()
    {
        TreeSet treeset = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int i = 0;
        for (int j = size(); i < j; i++)
        {
            treeset.add(name(i));
        }

        return Collections.unmodifiableSet(treeset);
    }

    public Builder newBuilder()
    {
        Builder builder = new Builder();
        Collections.addAll(builder.namesAndValues, namesAndValues);
        return builder;
    }

    public int size()
    {
        return namesAndValues.length / 2;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        int i = 0;
        for (int j = size(); i < j; i++)
        {
            stringbuilder.append(name(i)).append(": ").append(value(i)).append("\n");
        }

        return stringbuilder.toString();
    }

    public String value(int i)
    {
        i = i * 2 + 1;
        if (i < 0 || i >= namesAndValues.length)
        {
            return null;
        } else
        {
            return namesAndValues[i];
        }
    }

    public List values(String s)
    {
        ArrayList arraylist = null;
        int i = 0;
        for (int j = size(); i < j;)
        {
            ArrayList arraylist1 = arraylist;
            if (s.equalsIgnoreCase(name(i)))
            {
                arraylist1 = arraylist;
                if (arraylist == null)
                {
                    arraylist1 = new ArrayList(2);
                }
                arraylist1.add(value(i));
            }
            i++;
            arraylist = arraylist1;
        }

        if (arraylist != null)
        {
            return Collections.unmodifiableList(arraylist);
        } else
        {
            return Collections.emptyList();
        }
    }
}
