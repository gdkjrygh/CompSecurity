// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.args;


// Referenced classes of package com.vladium.util.args:
//            OptsParser

static final class m_usage
{

    static final int C_ONE[] = {
        1, 1
    };
    static final int C_ONE_OR_MORE[] = {
        1, 0x7fffffff
    };
    static final int C_ZERO[] = {
        0, 0
    };
    static final int C_ZERO_OR_MORE[] = {
        0, 0x7fffffff
    };
    static final int C_ZERO_OR_ONE[] = {
        0, 1
    };
    private String m_description;
    private boolean m_detailedOnly;
    private String m_excludesSet[];
    private boolean m_mergeable;
    private String m_names[];
    private boolean m_pattern;
    private boolean m_required;
    private String m_requiresSet[];
    private final boolean m_usage;
    private int m_valueCardinality[];
    private String m_valueMnemonic;

    String getCanonicalName()
    {
        return m_names[0];
    }

    String getDescription()
    {
        return m_description;
    }

    String[] getExcludesSet()
    {
        return m_excludesSet;
    }

    String[] getNames()
    {
        return m_names;
    }

    String[] getRequiresSet()
    {
        return m_requiresSet;
    }

    int[] getValueCardinality()
    {
        return m_valueCardinality;
    }

    String getValueMnemonic()
    {
        return m_valueMnemonic;
    }

    boolean isDetailedOnly()
    {
        return m_detailedOnly;
    }

    boolean isMergeable()
    {
        return m_mergeable;
    }

    boolean isPattern()
    {
        return m_pattern;
    }

    boolean isRequired()
    {
        return m_required;
    }

    boolean isUsage()
    {
        return m_usage;
    }

    void setDescription(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: description");
        } else
        {
            m_description = s;
            return;
        }
    }

    void setDetailedOnly(boolean flag)
    {
        m_detailedOnly = flag;
    }

    void setExcludesSet(String as[])
    {
        if (as == null)
        {
            throw new IllegalArgumentException("null input: names");
        }
        if (as.length <= 0)
        {
            as = null;
        }
        m_excludesSet = as;
    }

    void setMergeable(boolean flag)
    {
        m_mergeable = flag;
    }

    void setNames(String as[])
    {
        if (as == null)
        {
            throw new IllegalArgumentException("null input: names");
        } else
        {
            m_names = as;
            return;
        }
    }

    void setPattern(boolean flag)
    {
        m_pattern = flag;
    }

    void setRequired(boolean flag)
    {
        m_required = flag;
    }

    void setRequiresSet(String as[])
    {
        if (as == null)
        {
            throw new IllegalArgumentException("null input: names");
        }
        if (as.length <= 0)
        {
            as = null;
        }
        m_requiresSet = as;
    }

    void setValueCardinality(int ai[])
    {
        if (ai == null || ai.length != 2)
        {
            throw new IllegalArgumentException("null or invalid input: cardinality");
        } else
        {
            m_valueCardinality = ai;
            return;
        }
    }

    void setValueMnemonic(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null input: mnemonic");
        } else
        {
            m_valueMnemonic = s;
            return;
        }
    }


    (boolean flag)
    {
        m_usage = flag;
    }
}
