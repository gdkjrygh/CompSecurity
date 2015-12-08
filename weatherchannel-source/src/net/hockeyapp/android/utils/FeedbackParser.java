// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.hockeyapp.android.objects.Feedback;
import net.hockeyapp.android.objects.FeedbackAttachment;
import net.hockeyapp.android.objects.FeedbackMessage;
import net.hockeyapp.android.objects.FeedbackResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FeedbackParser
{
    private static class FeedbackParserHolder
    {

        public static final FeedbackParser INSTANCE = new FeedbackParser();


        private FeedbackParserHolder()
        {
        }
    }


    private FeedbackParser()
    {
    }


    public static FeedbackParser getInstance()
    {
        return FeedbackParserHolder.INSTANCE;
    }

    public FeedbackResponse parseFeedbackResponse(String s)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        if (s == null) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject;
        Feedback feedback;
        JSONObject jsonobject1;
        jsonobject = new JSONObject(s);
        jsonobject1 = jsonobject.getJSONObject("feedback");
        feedback = new Feedback();
        JSONArray jsonarray = jsonobject1.getJSONArray("messages");
        s = null;
        if (jsonarray.length() <= 0) goto _L4; else goto _L3
_L3:
        obj = new ArrayList();
        int i = 0;
_L8:
        s = ((String) (obj));
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        String s6;
        String s7;
        String s8;
        String s9;
        String s10;
        String s11;
        JSONArray jsonarray1;
        int k;
        int l;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = jsonarray.getJSONObject(i).getString("subject").toString();
        s2 = jsonarray.getJSONObject(i).getString("text").toString();
        s3 = jsonarray.getJSONObject(i).getString("oem").toString();
        s4 = jsonarray.getJSONObject(i).getString("model").toString();
        s5 = jsonarray.getJSONObject(i).getString("os_version").toString();
        s6 = jsonarray.getJSONObject(i).getString("created_at").toString();
        k = jsonarray.getJSONObject(i).getInt("id");
        s7 = jsonarray.getJSONObject(i).getString("token").toString();
        l = jsonarray.getJSONObject(i).getInt("via");
        s8 = jsonarray.getJSONObject(i).getString("user_string").toString();
        s9 = jsonarray.getJSONObject(i).getString("clean_text").toString();
        s10 = jsonarray.getJSONObject(i).getString("name").toString();
        s11 = jsonarray.getJSONObject(i).getString("app_id").toString();
        jsonarray1 = jsonarray.getJSONObject(i).optJSONArray("attachments");
        s = Collections.emptyList();
        if (jsonarray1 == null) goto _L6; else goto _L5
_L5:
        ArrayList arraylist = new ArrayList();
        int j = 0;
_L7:
        s = arraylist;
        if (j >= jsonarray1.length())
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = jsonarray1.getJSONObject(j).getInt("id");
        int j1 = jsonarray1.getJSONObject(j).getInt("feedback_message_id");
        s = jsonarray1.getJSONObject(j).getString("file_name");
        String s12 = jsonarray1.getJSONObject(j).getString("url");
        String s13 = jsonarray1.getJSONObject(j).getString("created_at");
        String s14 = jsonarray1.getJSONObject(j).getString("updated_at");
        FeedbackAttachment feedbackattachment = new FeedbackAttachment();
        feedbackattachment.setId(i1);
        feedbackattachment.setMessageId(j1);
        feedbackattachment.setFilename(s);
        feedbackattachment.setUrl(s12);
        feedbackattachment.setCreatedAt(s13);
        feedbackattachment.setUpdatedAt(s14);
        arraylist.add(feedbackattachment);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
        FeedbackMessage feedbackmessage = new FeedbackMessage();
        feedbackmessage.setAppId(s11);
        feedbackmessage.setCleanText(s9);
        feedbackmessage.setCreatedAt(s6);
        feedbackmessage.setId(k);
        feedbackmessage.setModel(s4);
        feedbackmessage.setName(s10);
        feedbackmessage.setOem(s3);
        feedbackmessage.setOsVersion(s5);
        feedbackmessage.setSubjec(s1);
        feedbackmessage.setText(s2);
        feedbackmessage.setToken(s7);
        feedbackmessage.setUserString(s8);
        feedbackmessage.setVia(l);
        feedbackmessage.setFeedbackAttachments(s);
        ((ArrayList) (obj)).add(feedbackmessage);
        i++;
        if (true) goto _L8; else goto _L4
_L4:
        feedback.setMessages(s);
        feedback.setName(jsonobject1.getString("name").toString());
_L9:
        feedback.setEmail(jsonobject1.getString("email").toString());
_L10:
        feedback.setId(jsonobject1.getInt("id"));
_L11:
        feedback.setCreatedAt(jsonobject1.getString("created_at").toString());
_L12:
        s = new FeedbackResponse();
        s.setFeedback(feedback);
        s.setStatus(jsonobject.getString("status").toString());
_L13:
        s.setToken(jsonobject.getString("token").toString());
_L14:
        obj = s;
_L2:
        return ((FeedbackResponse) (obj));
        s;
        s.printStackTrace();
          goto _L9
        s;
        obj = obj1;
_L15:
        s.printStackTrace();
        return ((FeedbackResponse) (obj));
        s;
        s.printStackTrace();
          goto _L10
        s;
        s.printStackTrace();
          goto _L11
        s;
        s.printStackTrace();
          goto _L12
        obj;
        ((JSONException) (obj)).printStackTrace();
          goto _L13
        obj;
        ((JSONException) (obj)).printStackTrace();
          goto _L14
        s;
        obj = obj1;
          goto _L15
        JSONException jsonexception;
        jsonexception;
        obj = s;
        s = jsonexception;
          goto _L15
    }
}
