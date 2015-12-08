// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

// Referenced classes of package com.urbanairship:
//            PropertyName, Logger, ConstantClass

public abstract class Options
{

    public Options()
    {
    }

    private String getPropertyValue(Field field, Properties properties)
    {
        String s = null;
        PropertyName propertyname = (PropertyName)field.getAnnotation(com/urbanairship/PropertyName);
        if (propertyname != null)
        {
            s = properties.getProperty(propertyname.name());
            Logger.verbose((new StringBuilder()).append("Found PropertyAnnotation for ").append(propertyname.name()).append(" matching ").append(field.getName()).toString());
        }
        return s;
    }

    private void setPropertyValue(Field field, String s)
    {
        if (field.getType() == Boolean.TYPE || field.getType() == java/lang/Boolean)
        {
            field.set(this, Boolean.valueOf(s));
            return;
        }
        if (field.getType() == Integer.TYPE || field.getType() == java/lang/Integer)
        {
            field.set(this, Integer.valueOf(parseOptionValues(field, s)));
            return;
        }
        if (field.getType() == Long.TYPE || field.getType() == java/lang/Long)
        {
            field.set(this, Long.valueOf(s));
            return;
        }
        try
        {
            field.set(this, s.trim());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.error((new StringBuilder()).append("Unable to set field '").append(field.getName()).append("' because the field is not visible.").toString(), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.error((new StringBuilder()).append("Unable to set field '").append(field.getName()).append("' due invalid configuration value.").toString(), s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.error((new StringBuilder()).append("Unable to set field '").append(field.getName()).append("' due invalid configuration value.").toString(), s);
        }
        return;
    }

    public abstract String getDefaultPropertiesFilename();

    public abstract boolean isValid();

    public void loadFromProperties(Context context)
    {
        loadFromProperties(context, getDefaultPropertiesFilename());
    }

    public void loadFromProperties(Context context, String s)
    {
        AssetManager assetmanager = context.getResources().getAssets();
        if (Arrays.asList(assetmanager.list("")).contains(s)) goto _L2; else goto _L1
_L1:
        Logger.verbose((new StringBuilder()).append("Options - Couldn't find ").append(s).toString());
_L6:
        return;
        context;
        Logger.error(context);
        return;
_L2:
        int i;
        context = new Properties();
        Field afield[];
        Field field;
        String s1;
        int j;
        try
        {
            context.load(assetmanager.open(s));
            afield = getClass().getDeclaredFields();
            j = afield.length;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.error((new StringBuilder()).append("Error loading properties file ").append(s).toString(), context);
            return;
        }
        i = 0;
_L4:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        field = afield[i];
        if (com/urbanairship/Options.isAssignableFrom(field.getType()))
        {
            break MISSING_BLOCK_LABEL_166;
        }
        s1 = getPropertyValue(field, context);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        setPropertyValue(field, s1);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    int parseOptionValues(Field field, String s)
        throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException
    {
        int i;
        try
        {
            i = Integer.valueOf(s).intValue();
        }
        catch (NumberFormatException numberformatexception)
        {
            ConstantClass constantclass = (ConstantClass)field.getAnnotation(com/urbanairship/ConstantClass);
            if (constantclass == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("The field '").append(field.getName()).append("' has a type mismatch or missing annotation.").toString());
            }
            Field afield[] = Class.forName(constantclass.name()).getDeclaredFields();
            int k = afield.length;
            for (int j = 0; j < k; j++)
            {
                Field field1 = afield[j];
                if (field1.getName().equalsIgnoreCase(s))
                {
                    try
                    {
                        j = field1.getInt(this);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        throw new IllegalArgumentException((new StringBuilder()).append("The field '").append(field.getName()).append("' is incompatible with specified class").toString(), s);
                    }
                    return j;
                }
            }

            throw new IllegalArgumentException((new StringBuilder()).append("Unable to match class for field '").append(field.getName()).append("'").toString());
        }
        return i;
    }
}
