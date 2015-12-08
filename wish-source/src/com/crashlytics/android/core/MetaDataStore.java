// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.crashlytics.android.core:
//            UserMetaData

class MetaDataStore
{

    private static final String KEYDATA_SUFFIX = "keys";
    private static final String KEY_USER_EMAIL = "userEmail";
    private static final String KEY_USER_ID = "userId";
    private static final String KEY_USER_NAME = "userName";
    private static final String METADATA_EXT = ".meta";
    private static final String USERDATA_SUFFIX = "user";
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private final File filesDir;

    public MetaDataStore(File file)
    {
        filesDir = file;
    }

    private File getKeysFileForSession(String s)
    {
        return new File(filesDir, (new StringBuilder()).append(s).append("keys").append(".meta").toString());
    }

    private File getUserDataFileForSession(String s)
    {
        return new File(filesDir, (new StringBuilder()).append(s).append("user").append(".meta").toString());
    }

    private static Map jsonToKeysData(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        HashMap hashmap = new HashMap();
        String s1;
        for (Iterator iterator = s.keys(); iterator.hasNext(); hashmap.put(s1, valueOrNull(s, s1)))
        {
            s1 = (String)iterator.next();
        }

        return hashmap;
    }

    private static UserMetaData jsonToUserData(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        return new UserMetaData(valueOrNull(s, "userId"), valueOrNull(s, "userName"), valueOrNull(s, "userEmail"));
    }

    private static String keysDataToJson(Map map)
        throws JSONException
    {
        return (new JSONObject(map)).toString();
    }

    private static String userDataToJson(UserMetaData usermetadata)
        throws JSONException
    {
        return (new JSONObject(usermetadata) {

            final UserMetaData val$userData;

            
                throws JSONException
            {
                userData = usermetadata;
                super();
                put("userId", userData.id);
                put("userName", userData.name);
                put("userEmail", userData.email);
            }
        }).toString();
    }

    private static String valueOrNull(JSONObject jsonobject, String s)
    {
        String s1 = null;
        if (!jsonobject.isNull(s))
        {
            s1 = jsonobject.optString(s, null);
        }
        return s1;
    }

    public Map readKeyData(String s)
    {
        Object obj;
        Object obj1;
        obj = getKeysFileForSession(s);
        if (!((File) (obj)).exists())
        {
            return Collections.emptyMap();
        }
        s = null;
        obj1 = null;
        obj = new FileInputStream(((File) (obj)));
        s = jsonToKeysData(CommonUtils.streamToString(((java.io.InputStream) (obj))));
        CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
        return s;
        s;
        obj = obj1;
        obj1 = s;
_L4:
        s = ((String) (obj));
        Fabric.getLogger().e("CrashlyticsCore", "Error deserializing user metadata.", ((Throwable) (obj1)));
        CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
        return Collections.emptyMap();
        obj;
_L2:
        CommonUtils.closeOrLog(s, "Failed to close user metadata file.");
        throw obj;
        obj1;
        s = ((String) (obj));
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public UserMetaData readUserData(String s)
    {
        Object obj;
        Object obj1;
        obj = getUserDataFileForSession(s);
        if (!((File) (obj)).exists())
        {
            return UserMetaData.EMPTY;
        }
        s = null;
        obj1 = null;
        obj = new FileInputStream(((File) (obj)));
        s = jsonToUserData(CommonUtils.streamToString(((java.io.InputStream) (obj))));
        CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
        return s;
        s;
        obj = obj1;
        obj1 = s;
_L4:
        s = ((String) (obj));
        Fabric.getLogger().e("CrashlyticsCore", "Error deserializing user metadata.", ((Throwable) (obj1)));
        CommonUtils.closeOrLog(((java.io.Closeable) (obj)), "Failed to close user metadata file.");
        return UserMetaData.EMPTY;
        obj;
_L2:
        CommonUtils.closeOrLog(s, "Failed to close user metadata file.");
        throw obj;
        obj1;
        s = ((String) (obj));
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void writeKeyData(String s, Map map)
    {
        Object obj;
        Object obj1;
        File file;
        file = getKeysFileForSession(s);
        obj1 = null;
        obj = null;
        s = obj1;
        String s1 = keysDataToJson(map);
        s = obj1;
        map = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), UTF_8));
        map.write(s1);
        map.flush();
        CommonUtils.closeOrLog(map, "Failed to close key/value metadata file.");
        return;
        s;
        map = ((Map) (obj));
        obj = s;
_L4:
        s = map;
        Fabric.getLogger().e("CrashlyticsCore", "Error serializing key/value metadata.", ((Throwable) (obj)));
        CommonUtils.closeOrLog(map, "Failed to close key/value metadata file.");
        return;
        map;
_L2:
        CommonUtils.closeOrLog(s, "Failed to close key/value metadata file.");
        throw map;
        obj;
        s = map;
        map = ((Map) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void writeUserData(String s, UserMetaData usermetadata)
    {
        Object obj;
        Object obj1;
        File file;
        file = getUserDataFileForSession(s);
        obj1 = null;
        obj = null;
        s = obj1;
        String s1 = userDataToJson(usermetadata);
        s = obj1;
        usermetadata = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), UTF_8));
        usermetadata.write(s1);
        usermetadata.flush();
        CommonUtils.closeOrLog(usermetadata, "Failed to close user metadata file.");
        return;
        s;
        usermetadata = ((UserMetaData) (obj));
        obj = s;
_L4:
        s = usermetadata;
        Fabric.getLogger().e("CrashlyticsCore", "Error serializing user metadata.", ((Throwable) (obj)));
        CommonUtils.closeOrLog(usermetadata, "Failed to close user metadata file.");
        return;
        usermetadata;
_L2:
        CommonUtils.closeOrLog(s, "Failed to close user metadata file.");
        throw usermetadata;
        obj;
        s = usermetadata;
        usermetadata = ((UserMetaData) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

}
