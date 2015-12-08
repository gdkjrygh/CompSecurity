// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.seppius.i18n.plurals;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

// Referenced classes of package com.seppius.i18n.plurals:
//            PluralRules

public class PluralResources
{

    private Method getResourceBagTextMethod;
    private String language;
    private Resources resources;
    private PluralRules rules;
    private boolean treatZero;

    public PluralResources(Resources resources1)
        throws SecurityException, NoSuchMethodException
    {
        treatZero = true;
        resources = resources1;
        getResourceBagTextMethod = resources1.getAssets().getClass().getDeclaredMethod("getResourceBagText", new Class[] {
            Integer.TYPE, Integer.TYPE
        });
        getResourceBagTextMethod.setAccessible(true);
    }

    public String getQuantityString(int i, int j)
        throws android.content.res.Resources.NotFoundException
    {
        Object obj;
        obj = Locale.getDefault();
        if (!((Locale) (obj)).getLanguage().equals(language))
        {
            language = ((Locale) (obj)).getLanguage();
            rules = PluralRules.ruleForLocale(((Locale) (obj)));
        }
        if (rules == null)
        {
            return resources.getQuantityString(i, j);
        }
        if (getResourceBagTextMethod == null)
        {
            throw new IllegalArgumentException();
        }
        Object obj1 = null;
        obj = obj1;
        if (j == 0)
        {
            obj = obj1;
            try
            {
                if (treatZero)
                {
                    obj = getResourceBagTextMethod.invoke(resources.getAssets(), new Object[] {
                        Integer.valueOf(i), Integer.valueOf(0x1000005)
                    });
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new android.content.res.Resources.NotFoundException(((IllegalArgumentException) (obj)).getMessage());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new android.content.res.Resources.NotFoundException(((IllegalAccessException) (obj)).getMessage());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new android.content.res.Resources.NotFoundException(((InvocationTargetException) (obj)).getMessage());
            }
        }
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        obj1 = getResourceBagTextMethod.invoke(resources.getAssets(), new Object[] {
            Integer.valueOf(i), Integer.valueOf(PluralRules.attrForQuantity(rules.quantityForNumber(j)))
        });
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        obj = getResourceBagTextMethod.invoke(resources.getAssets(), new Object[] {
            Integer.valueOf(i), Integer.valueOf(0x1000004)
        });
        if (obj == null)
        {
            throw new android.content.res.Resources.NotFoundException((new StringBuilder()).append("Plural resource ID #0x").append(Integer.toHexString(i)).append(" quantity=").append(j).append(" item=").append(PluralRules.stringForQuantity(rules.quantityForNumber(j))).toString());
        } else
        {
            return obj.toString();
        }
    }

    public transient String getQuantityString(int i, int j, Object aobj[])
        throws android.content.res.Resources.NotFoundException
    {
        return String.format(resources.getConfiguration().locale, getQuantityString(i, j), aobj);
    }

    public void setTreatZero(boolean flag)
    {
        treatZero = flag;
    }
}
