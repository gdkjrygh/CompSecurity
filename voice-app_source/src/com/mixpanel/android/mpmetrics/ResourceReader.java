// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            ResourceIds

public abstract class ResourceReader
    implements ResourceIds
{
    public static class Drawables extends ResourceReader
    {

        private final String mResourcePackageName;

        protected String getLocalClassName(Context context)
        {
            return (new StringBuilder(String.valueOf(mResourcePackageName))).append(".R$drawable").toString();
        }

        protected Class getSystemClass()
        {
            return android/R$drawable;
        }

        protected Drawables(String s, Context context)
        {
            super(context);
            mResourcePackageName = s;
            initialize();
        }
    }

    public static class Ids extends ResourceReader
    {

        private final String mResourcePackageName;

        protected String getLocalClassName(Context context)
        {
            return (new StringBuilder(String.valueOf(mResourcePackageName))).append(".R$id").toString();
        }

        protected Class getSystemClass()
        {
            return android/R$id;
        }

        public Ids(String s, Context context)
        {
            super(context);
            mResourcePackageName = s;
            initialize();
        }
    }


    private static final String LOGTAG = "MixpanelAPI.RsrcReader";
    private final Context mContext;
    private final Map mIdNameToId = new HashMap();
    private final SparseArray mIdToIdName = new SparseArray();

    protected ResourceReader(Context context)
    {
        mContext = context;
    }

    private static void readClassIds(Class class1, String s, Map map)
    {
        int i;
        String s1;
        Field afield[];
        Field field;
        int j;
        try
        {
            afield = class1.getFields();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("MixpanelAPI.RsrcReader", (new StringBuilder("Can't read built-in id names from ")).append(class1.getName()).toString(), s);
            return;
        }
        i = 0;
_L6:
        if (i >= afield.length)
        {
            return;
        }
        field = afield[i];
        if (!Modifier.isStatic(field.getModifiers()) || field.getType() != Integer.TYPE) goto _L2; else goto _L1
_L1:
        s1 = field.getName();
        j = field.getInt(null);
        if (s != null) goto _L4; else goto _L3
_L3:
        map.put(s1, Integer.valueOf(j));
        break; /* Loop/switch isn't completed */
_L4:
        s1 = (new StringBuilder(String.valueOf(s))).append(":").append(s1).toString();
        if (true) goto _L3; else goto _L2
_L2:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected abstract String getLocalClassName(Context context);

    protected abstract Class getSystemClass();

    public int idFromName(String s)
    {
        return ((Integer)mIdNameToId.get(s)).intValue();
    }

    protected void initialize()
    {
        mIdNameToId.clear();
        mIdToIdName.clear();
        readClassIds(getSystemClass(), "android", mIdNameToId);
        Object obj = getLocalClassName(mContext);
        try
        {
            readClassIds(Class.forName(((String) (obj))), null, mIdNameToId);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            Log.w("MixpanelAPI.RsrcReader", (new StringBuilder("Can't load names for Android view ids from '")).append(((String) (obj))).append("', ids by name will not be available in the events editor.").toString());
            Log.i("MixpanelAPI.RsrcReader", "You may be missing a Resources class for your package due to your proguard configuration, or you may be using an applicationId in your build that isn't the same as the package declared in your AndroidManifest.xml file.\nIf you're using proguard, you can fix this issue by adding the following to your proguard configuration:\n\n-keep class **.R$* {\n    <fields>;\n}\n\nIf you're not using proguard, or if your proguard configuration already contains the directive above, you can add the following to your AndroidManifest.xml file to explicitly point the Mixpanel library to the appropriate library for your resources class:\n\n<meta-data android:name=\"com.mixpanel.android.MPConfig.ResourcePackageName\" android:value=\"YOUR_PACKAGE_NAME\" />\n\nwhere YOUR_PACKAGE_NAME is the same string you use for the \"package\" attribute in your <manifest> tag.");
        }
        obj = mIdNameToId.entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                return;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            mIdToIdName.put(((Integer)entry.getValue()).intValue(), (String)entry.getKey());
        } while (true);
    }

    public boolean knownIdName(String s)
    {
        return mIdNameToId.containsKey(s);
    }

    public String nameForId(int i)
    {
        return (String)mIdToIdName.get(i);
    }
}
