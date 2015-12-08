// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.Pair;
import com.mixpanel.android.mpmetrics.ResourceIds;
import com.mixpanel.android.util.JSONUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ImageStore, Caller, PropertyDescription, ViewSnapshot, 
//            ViewVisitor

class EditProtocol
{
    public static class BadInstructionsException extends Exception
    {

        private static final long serialVersionUID = 0xc7a0dc29b5edfa61L;

        public BadInstructionsException(String s)
        {
            super(s);
        }

        public BadInstructionsException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }

    public static class CantGetEditAssetsException extends Exception
    {

        public CantGetEditAssetsException(String s)
        {
            super(s);
        }

        public CantGetEditAssetsException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }

    public static class Edit
    {

        public final List imageUrls;
        public final ViewVisitor visitor;

        private Edit(ViewVisitor viewvisitor, List list)
        {
            visitor = viewvisitor;
            imageUrls = list;
        }

        Edit(ViewVisitor viewvisitor, List list, Edit edit)
        {
            this(viewvisitor, list);
        }
    }

    public static class InapplicableInstructionsException extends BadInstructionsException
    {

        private static final long serialVersionUID = 0x37315801d3e28970L;

        public InapplicableInstructionsException(String s)
        {
            super(s);
        }
    }


    private static final String LOGTAG = "MixpanelAPI.EProtocol";
    private static final List NEVER_MATCH_PATH = Collections.emptyList();
    private static final Class NO_PARAMS[] = new Class[0];
    private final ImageStore mImageStore;
    private final ViewVisitor.OnLayoutErrorListener mLayoutErrorListener;
    private final ResourceIds mResourceIds;

    public EditProtocol(ResourceIds resourceids, ImageStore imagestore, ViewVisitor.OnLayoutErrorListener onlayouterrorlistener)
    {
        mResourceIds = resourceids;
        mImageStore = imagestore;
        mLayoutErrorListener = onlayouterrorlistener;
    }

    private Object convertArgument(Object obj, String s, List list)
        throws BadInstructionsException, CantGetEditAssetsException
    {
        if ("java.lang.CharSequence".equals(s))
        {
            return obj;
        }
        try
        {
            if (!"boolean".equals(s) && !"java.lang.Boolean".equals(s))
            {
                if ("int".equals(s) || "java.lang.Integer".equals(s))
                {
                    return Integer.valueOf(((Number)obj).intValue());
                }
                if ("float".equals(s) || "java.lang.Float".equals(s))
                {
                    return Float.valueOf(((Number)obj).floatValue());
                }
                if ("android.graphics.drawable.Drawable".equals(s))
                {
                    return readBitmapDrawable((JSONObject)obj, list);
                }
                if ("android.graphics.drawable.BitmapDrawable".equals(s))
                {
                    return readBitmapDrawable((JSONObject)obj, list);
                }
                if ("android.graphics.drawable.ColorDrawable".equals(s))
                {
                    return new ColorDrawable(((Number)obj).intValue());
                } else
                {
                    throw new BadInstructionsException((new StringBuilder("Don't know how to interpret type ")).append(s).append(" (arg was ").append(obj).append(")").toString());
                }
            }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new BadInstructionsException((new StringBuilder("Couldn't interpret <")).append(obj).append("> as ").append(s).toString());
        }
        return obj;
    }

    private Drawable readBitmapDrawable(JSONObject jsonobject, List list)
        throws BadInstructionsException, CantGetEditAssetsException
    {
        try
        {
            if (jsonobject.isNull("url"))
            {
                throw new BadInstructionsException("Can't construct a BitmapDrawable with a null url");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Couldn't read drawable description", jsonobject);
        }
        String s;
        boolean flag1;
        s = jsonobject.getString("url");
        flag1 = jsonobject.isNull("dimensions");
        if (!flag1) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        int k;
        int l;
        boolean flag;
        i = 0;
        l = 0;
        k = 0;
        j = 0;
        flag = false;
_L4:
        jsonobject = mImageStore.getImage(s);
        list.add(s);
        jsonobject = new BitmapDrawable(Resources.getSystem(), jsonobject);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject.setBounds(j, l, k, i);
        return jsonobject;
_L2:
        jsonobject = jsonobject.getJSONObject("dimensions");
        j = jsonobject.getInt("left");
        k = jsonobject.getInt("right");
        l = jsonobject.getInt("top");
        i = jsonobject.getInt("bottom");
        flag = true;
        if (true) goto _L4; else goto _L3
        jsonobject;
        throw new CantGetEditAssetsException(jsonobject.getMessage(), jsonobject.getCause());
_L3:
        return jsonobject;
    }

    private PropertyDescription readPropertyDescription(Class class1, JSONObject jsonobject)
        throws BadInstructionsException
    {
        Object obj;
        String s;
        Object obj1;
        try
        {
            s = jsonobject.getString("name");
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new BadInstructionsException("Can't create property reader", class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new BadInstructionsException("Can't read property JSON", class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new BadInstructionsException("Can't read property JSON, relevant arg/return class not found", class1);
        }
        obj = null;
        if (jsonobject.has("get"))
        {
            obj1 = jsonobject.getJSONObject("get");
            obj = ((JSONObject) (obj1)).getString("selector");
            obj1 = Class.forName(((JSONObject) (obj1)).getJSONObject("result").getString("type"));
            obj = new Caller(class1, ((String) (obj)), NO_PARAMS, ((Class) (obj1)));
        }
        if (!jsonobject.has("set"))
        {
            break MISSING_BLOCK_LABEL_103;
        }
        jsonobject = jsonobject.getJSONObject("set").getString("selector");
_L1:
        class1 = new PropertyDescription(s, class1, ((Caller) (obj)), jsonobject);
        return class1;
        jsonobject = null;
          goto _L1
    }

    private Integer reconcileIds(int i, String s, ResourceIds resourceids)
    {
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!resourceids.knownIdName(s)) goto _L4; else goto _L3
_L3:
        int j = resourceids.idFromName(s);
_L6:
        if (-1 != j && -1 != i && j != i)
        {
            Log.e("MixpanelAPI.EProtocol", "Path contains both a named and an explicit id, and they don't match. No views will be matched.");
            return null;
        }
        break; /* Loop/switch isn't completed */
_L4:
        Log.w("MixpanelAPI.EProtocol", (new StringBuilder("Path element contains an id name not known to the system. No views will be matched.\nMake sure that you're not stripping your packages R class out with proguard.\nid name was \"")).append(s).append("\"").toString());
        return null;
_L2:
        j = -1;
        if (true) goto _L6; else goto _L5
_L5:
        if (-1 != j)
        {
            return Integer.valueOf(j);
        } else
        {
            return Integer.valueOf(i);
        }
    }

    public Edit readEdit(JSONObject jsonobject)
        throws BadInstructionsException, CantGetEditAssetsException
    {
        Object obj;
        ArrayList arraylist;
        List list;
        arraylist = new ArrayList();
        try
        {
            list = readPath(jsonobject.getJSONArray("path"), mResourceIds);
            if (list.size() == 0)
            {
                throw new InapplicableInstructionsException("Edit will not be bound to any element in the UI.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Can't create property mutator", jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Can't interpret instructions due to JSONException", jsonobject);
        }
        if (!jsonobject.getString("change_type").equals("property")) goto _L2; else goto _L1
_L1:
        obj = jsonobject.getJSONObject("property").getString("classname");
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        throw new BadInstructionsException("Can't bind an edit property without a target class");
        Object obj1 = Class.forName(((String) (obj)));
        Object aobj[];
        obj = readPropertyDescription(((Class) (obj1)), jsonobject.getJSONObject("property"));
        jsonobject = jsonobject.getJSONArray("args");
        aobj = new Object[jsonobject.length()];
        int i = 0;
_L4:
        if (i < jsonobject.length())
        {
            break MISSING_BLOCK_LABEL_238;
        }
        jsonobject = ((PropertyDescription) (obj)).makeMutator(aobj);
        if (jsonobject != null)
        {
            break; /* Loop/switch isn't completed */
        }
        throw new BadInstructionsException((new StringBuilder("Can't update a read-only property ")).append(((PropertyDescription) (obj)).name).append(" (add a mutator to make this work)").toString());
        jsonobject;
        throw new BadInstructionsException((new StringBuilder("Can't find class for visit path: ")).append(((String) (obj))).toString(), jsonobject);
        JSONArray jsonarray = jsonobject.getJSONArray(i);
        aobj[i] = convertArgument(jsonarray.get(0), jsonarray.getString(1), arraylist);
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        jsonobject = new ViewVisitor.PropertySetVisitor(list, jsonobject, ((PropertyDescription) (obj)).accessor);
_L7:
        return new Edit(jsonobject, arraylist, null);
_L2:
        if (!jsonobject.getString("change_type").equals("layout")) goto _L6; else goto _L5
_L5:
        ArrayList arraylist1;
        int j;
        aobj = jsonobject.getJSONArray("args");
        arraylist1 = new ArrayList();
        j = ((JSONArray) (aobj)).length();
        i = 0;
_L16:
        if (i < j)
        {
            break MISSING_BLOCK_LABEL_379;
        }
        jsonobject = new ViewVisitor.LayoutUpdateVisitor(list, arraylist1, jsonobject.getString("name"), mLayoutErrorListener);
          goto _L7
        JSONObject jsonobject1;
        String s;
        String s1;
        Integer integer;
        jsonobject1 = ((JSONArray) (aobj)).optJSONObject(i);
        s = jsonobject1.getString("view_id_name");
        s1 = jsonobject1.getString("anchor_id_name");
        integer = reconcileIds(-1, s, mResourceIds);
        if (!s1.equals("0")) goto _L9; else goto _L8
_L8:
        obj = Integer.valueOf(0);
          goto _L10
_L14:
        Log.w("MixpanelAPI.EProtocol", (new StringBuilder("View (")).append(s).append(") or anchor (").append(s1).append(") not found.").toString());
          goto _L11
_L9:
        if (!s1.equals("-1")) goto _L13; else goto _L12
_L12:
        obj = Integer.valueOf(-1);
          goto _L10
_L13:
        obj = reconcileIds(-1, s1, mResourceIds);
          goto _L10
_L15:
        arraylist1.add(new ViewVisitor.LayoutRule(integer.intValue(), jsonobject1.getInt("verb"), ((Integer) (obj)).intValue()));
          goto _L11
_L6:
        throw new BadInstructionsException("Can't figure out the edit type");
_L10:
        if (integer != null && obj != null) goto _L15; else goto _L14
_L11:
        i++;
          goto _L16
    }

    public ViewVisitor readEventBinding(JSONObject jsonobject, ViewVisitor.OnEventListener oneventlistener)
        throws BadInstructionsException
    {
        String s;
        String s1;
        try
        {
            s = jsonobject.getString("event_name");
            s1 = jsonobject.getString("event_type");
            jsonobject = readPath(jsonobject.getJSONArray("path"), mResourceIds);
            if (jsonobject.size() == 0)
            {
                throw new InapplicableInstructionsException((new StringBuilder("event '")).append(s).append("' will not be bound to any element in the UI.").toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Can't interpret instructions due to JSONException", jsonobject);
        }
        if ("click".equals(s1))
        {
            return new ViewVisitor.AddAccessibilityEventVisitor(jsonobject, 1, s, oneventlistener);
        }
        if ("selected".equals(s1))
        {
            return new ViewVisitor.AddAccessibilityEventVisitor(jsonobject, 4, s, oneventlistener);
        }
        if ("text_changed".equals(s1))
        {
            return new ViewVisitor.AddTextChangeListener(jsonobject, s, oneventlistener);
        }
        if ("detected".equals(s1))
        {
            return new ViewVisitor.ViewDetectorVisitor(jsonobject, s, oneventlistener);
        } else
        {
            throw new BadInstructionsException((new StringBuilder("Mixpanel can't track event type \"")).append(s1).append("\"").toString());
        }
    }

    List readPath(JSONArray jsonarray, ResourceIds resourceids)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            if (i >= jsonarray.length())
            {
                return arraylist;
            }
            Object obj1 = jsonarray.getJSONObject(i);
            Object obj = JSONUtils.optionalStringKey(((JSONObject) (obj1)), "prefix");
            String s = JSONUtils.optionalStringKey(((JSONObject) (obj1)), "view_class");
            int k = ((JSONObject) (obj1)).optInt("index", -1);
            String s1 = JSONUtils.optionalStringKey(((JSONObject) (obj1)), "contentDescription");
            int l = ((JSONObject) (obj1)).optInt("id", -1);
            String s2 = JSONUtils.optionalStringKey(((JSONObject) (obj1)), "mp_id_name");
            obj1 = JSONUtils.optionalStringKey(((JSONObject) (obj1)), "tag");
            int j;
            if ("shortest".equals(obj))
            {
                j = 1;
            } else
            if (obj == null)
            {
                j = 0;
            } else
            {
                Log.w("MixpanelAPI.EProtocol", (new StringBuilder("Unrecognized prefix type \"")).append(((String) (obj))).append("\". No views will be matched").toString());
                return NEVER_MATCH_PATH;
            }
            obj = reconcileIds(l, s2, resourceids);
            if (obj == null)
            {
                return NEVER_MATCH_PATH;
            }
            arraylist.add(new Pathfinder.PathElement(j, s, k, ((Integer) (obj)).intValue(), s1, ((String) (obj1))));
            i++;
        } while (true);
    }

    public ViewSnapshot readSnapshotConfig(JSONObject jsonobject)
        throws BadInstructionsException
    {
        ArrayList arraylist = new ArrayList();
        Class class1;
        Object obj;
        int i;
        int j;
        try
        {
            jsonobject = jsonobject.getJSONObject("config").getJSONArray("classes");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Can't read snapshot configuration", jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Can't resolve types for snapshot configuration", jsonobject);
        }
        i = 0;
        if (i >= jsonobject.length())
        {
            return new ViewSnapshot(arraylist, mResourceIds);
        }
        obj = jsonobject.getJSONObject(i);
        class1 = Class.forName(((JSONObject) (obj)).getString("name"));
        obj = ((JSONObject) (obj)).getJSONArray("properties");
        j = 0;
_L2:
        if (j < ((JSONArray) (obj)).length())
        {
            break MISSING_BLOCK_LABEL_98;
        }
        i++;
        break MISSING_BLOCK_LABEL_25;
        arraylist.add(readPropertyDescription(class1, ((JSONArray) (obj)).getJSONObject(j)));
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Pair readTweak(JSONObject jsonobject)
        throws BadInstructionsException
    {
        String s;
        String s1;
        s = jsonobject.getString("name");
        s1 = jsonobject.getString("type");
        if (!"number".equals(s1)) goto _L2; else goto _L1
_L1:
        s1 = jsonobject.getString("encoding");
        if (!"d".equals(s1)) goto _L4; else goto _L3
_L3:
        jsonobject = Double.valueOf(jsonobject.getDouble("value"));
_L7:
        return new Pair(s, jsonobject);
_L4:
        if (!"l".equals(s1)) goto _L6; else goto _L5
_L5:
        jsonobject = Long.valueOf(jsonobject.getLong("value"));
          goto _L7
_L6:
        try
        {
            throw new BadInstructionsException((new StringBuilder("number must have encoding of type \"l\" for long or \"d\" for double in: ")).append(jsonobject).toString());
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            throw new BadInstructionsException("Can't read tweak update", jsonobject);
        }
_L2:
label0:
        {
            if (!"boolean".equals(s1))
            {
                break label0;
            }
            jsonobject = Boolean.valueOf(jsonobject.getBoolean("value"));
        }
          goto _L7
label1:
        {
            if (!"string".equals(s1))
            {
                break label1;
            }
            jsonobject = jsonobject.getString("value");
        }
          goto _L7
        throw new BadInstructionsException((new StringBuilder("Unrecognized tweak type ")).append(s1).append(" in: ").append(jsonobject).toString());
    }

}
