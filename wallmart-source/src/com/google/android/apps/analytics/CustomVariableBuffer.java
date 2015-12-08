// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.analytics;


// Referenced classes of package com.google.android.apps.analytics:
//            CustomVariable

class CustomVariableBuffer
{

    private CustomVariable customVariables[];

    public CustomVariableBuffer()
    {
        customVariables = new CustomVariable[5];
    }

    private void throwOnInvalidIndex(int i)
    {
        if (i < 1 || i > 5)
        {
            throw new IllegalArgumentException("Index must be between 1 and 5 inclusive.");
        } else
        {
            return;
        }
    }

    public CustomVariable[] getCustomVariableArray()
    {
        return (CustomVariable[])customVariables.clone();
    }

    public CustomVariable getCustomVariableAt(int i)
    {
        throwOnInvalidIndex(i);
        return customVariables[i - 1];
    }

    public boolean hasCustomVariables()
    {
        boolean flag1 = false;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < customVariables.length)
                {
                    if (customVariables[i] == null)
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public boolean isIndexAvailable(int i)
    {
        throwOnInvalidIndex(i);
        return customVariables[i - 1] == null;
    }

    public void setCustomVariable(CustomVariable customvariable)
    {
        throwOnInvalidIndex(customvariable.getIndex());
        customVariables[customvariable.getIndex() - 1] = customvariable;
    }
}
