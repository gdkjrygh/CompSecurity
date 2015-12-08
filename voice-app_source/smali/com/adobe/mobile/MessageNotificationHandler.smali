.class public Lcom/adobe/mobile/MessageNotificationHandler;
.super Landroid/content/BroadcastReceiver;
.source "MessageNotificationHandler.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 39
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private getAppName()Ljava/lang/String;
    .locals 9

    .prologue
    const/4 v7, 0x1

    const/4 v8, 0x0

    .line 194
    const-string v0, ""

    .line 196
    .local v0, "appName":Ljava/lang/String;
    :try_start_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 197
    .local v4, "packageManager":Landroid/content/pm/PackageManager;
    if-eqz v4, :cond_0

    .line 198
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-virtual {v4, v5, v6}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 199
    .local v1, "applicationInfo":Landroid/content/pm/ApplicationInfo;
    if-eqz v1, :cond_0

    .line 200
    invoke-virtual {v4, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 201
    invoke-virtual {v4, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move-object v0, v5

    .line 212
    .end local v1    # "applicationInfo":Landroid/content/pm/ApplicationInfo;
    .end local v4    # "packageManager":Landroid/content/pm/PackageManager;
    :cond_0
    :goto_0
    return-object v0

    .line 201
    .restart local v1    # "applicationInfo":Landroid/content/pm/ApplicationInfo;
    .restart local v4    # "packageManager":Landroid/content/pm/PackageManager;
    :cond_1
    const-string v0, ""
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 205
    .end local v1    # "applicationInfo":Landroid/content/pm/ApplicationInfo;
    .end local v4    # "packageManager":Landroid/content/pm/PackageManager;
    :catch_0
    move-exception v3

    .line 206
    .local v3, "ex":Landroid/content/pm/PackageManager$NameNotFoundException;
    const-string v5, "Messages - unable to retrieve app name for local notification (%s)"

    new-array v6, v7, [Ljava/lang/Object;

    invoke-virtual {v3}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v8

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 207
    .end local v3    # "ex":Landroid/content/pm/PackageManager$NameNotFoundException;
    :catch_1
    move-exception v2

    .line 208
    .local v2, "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v5, "Messages - unable to get app name (%s)"

    new-array v6, v7, [Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v8

    invoke-static {v5, v6}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private getLargeIcon()Landroid/graphics/Bitmap;
    .locals 10

    .prologue
    .line 220
    const/4 v3, 0x0

    .line 224
    .local v3, "iconDrawable":Landroid/graphics/drawable/Drawable;
    :try_start_0
    invoke-static {}, Lcom/adobe/mobile/Messages;->getLargeIconResourceId()I

    move-result v4

    .line 225
    .local v4, "largeIconResourceId":I
    const/4 v6, -0x1

    if-eq v4, v6, :cond_2

    .line 226
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v4}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 243
    :cond_0
    :goto_0
    const/4 v2, 0x0

    .line 244
    .local v2, "icon":Landroid/graphics/Bitmap;
    if-eqz v3, :cond_1

    move-object v6, v3

    .line 245
    check-cast v6, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v6}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    .line 248
    .end local v2    # "icon":Landroid/graphics/Bitmap;
    .end local v4    # "largeIconResourceId":I
    :cond_1
    :goto_1
    return-object v2

    .line 230
    .restart local v4    # "largeIconResourceId":I
    :cond_2
    :try_start_1
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 231
    .local v0, "applicationInfo":Landroid/content/pm/ApplicationInfo;
    if-eqz v0, :cond_0

    .line 232
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 233
    .local v5, "packageManager":Landroid/content/pm/PackageManager;
    if-eqz v5, :cond_0

    .line 234
    invoke-virtual {v5, v0}, Landroid/content/pm/PackageManager;->getApplicationIcon(Landroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v3

    goto :goto_0

    .line 238
    .end local v0    # "applicationInfo":Landroid/content/pm/ApplicationInfo;
    .end local v4    # "largeIconResourceId":I
    .end local v5    # "packageManager":Landroid/content/pm/PackageManager;
    :catch_0
    move-exception v1

    .line 239
    .local v1, "e":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v6, "Messages - Unable to pull bundle icon (%s)"

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-virtual {v1}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    invoke-static {v6, v7}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    const/4 v2, 0x0

    goto :goto_1
.end method

.method private getSmallIcon()I
    .locals 2

    .prologue
    .line 216
    invoke-static {}, Lcom/adobe/mobile/Messages;->getSmallIconResourceId()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/adobe/mobile/Messages;->getSmallIconResourceId()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    const v0, 0x1080093

    goto :goto_0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 34
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "intent"    # Landroid/content/Intent;

    .prologue
    .line 43
    invoke-virtual/range {p2 .. p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v6

    .line 44
    .local v6, "bundle":Landroid/os/Bundle;
    if-nez v6, :cond_1

    .line 45
    const-string v30, "Messages - unable to load extras from local notification intent"

    const/16 v31, 0x0

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v31, v0

    invoke-static/range {v30 .. v31}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    :cond_0
    :goto_0
    return-void

    .line 54
    :cond_1
    :try_start_0
    const-string v30, "alarm_message"

    move-object/from16 v0, v30

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 55
    .local v11, "message":Ljava/lang/String;
    const-string v30, "adbMessageCode"

    move-object/from16 v0, v30

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v19

    .line 56
    .local v19, "requestCode":I
    const-string v30, "requestCode"

    move-object/from16 v0, v30

    invoke-virtual {v6, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v18

    .line 64
    .local v18, "otherRequestCode":I
    sget-object v30, Lcom/adobe/mobile/Messages;->MESSAGE_LOCAL_IDENTIFIER:Ljava/lang/Integer;

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Integer;->intValue()I

    move-result v30

    move/from16 v0, v19

    move/from16 v1, v30

    if-ne v0, v1, :cond_0

    .line 69
    if-nez v11, :cond_2

    .line 70
    const-string v30, "Messages - local notification message was empty "

    const/16 v31, 0x0

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v31, v0

    invoke-static/range {v30 .. v31}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 58
    .end local v11    # "message":Ljava/lang/String;
    .end local v18    # "otherRequestCode":I
    .end local v19    # "requestCode":I
    :catch_0
    move-exception v9

    .line 59
    .local v9, "ex":Ljava/lang/Exception;
    const-string v30, "Messages - unable to load message from local notification (%s)"

    const/16 v31, 0x1

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v31, v0

    const/16 v32, 0x0

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v33

    aput-object v33, v31, v32

    invoke-static/range {v30 .. v31}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 76
    .end local v9    # "ex":Ljava/lang/Exception;
    .restart local v11    # "message":Ljava/lang/String;
    .restart local v18    # "otherRequestCode":I
    .restart local v19    # "requestCode":I
    :cond_2
    :try_start_1
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getCurrentActivity()Landroid/app/Activity;
    :try_end_1
    .catch Lcom/adobe/mobile/StaticMethods$NullActivityException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v8

    .line 85
    .local v8, "currentActivity":Landroid/app/Activity;
    :try_start_2
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedContext()Landroid/content/Context;
    :try_end_2
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_2 .. :try_end_2} :catch_3

    move-result-object v28

    .line 92
    .local v28, "sharedContext":Landroid/content/Context;
    const/4 v13, 0x0

    .line 94
    .local v13, "notificationActivity":Landroid/app/Activity;
    :try_start_3
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getCurrentActivity()Landroid/app/Activity;
    :try_end_3
    .catch Lcom/adobe/mobile/StaticMethods$NullActivityException; {:try_start_3 .. :try_end_3} :catch_4

    move-result-object v13

    .line 100
    :goto_1
    if-eqz v13, :cond_3

    invoke-virtual {v13}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v20

    .line 101
    .local v20, "resumeIntent":Landroid/content/Intent;
    :goto_2
    const/high16 v30, 0x24000000

    move-object/from16 v0, v20

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 106
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 109
    .local v5, "buildVersion":I
    const/high16 v30, 0x8000000

    :try_start_4
    move-object/from16 v0, v28

    move/from16 v1, v18

    move-object/from16 v2, v20

    move/from16 v3, v30

    invoke-static {v0, v1, v2, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v21

    .line 114
    .local v21, "sender":Landroid/app/PendingIntent;
    if-nez v21, :cond_4

    .line 115
    const-string v30, "Messages - could not retrieve sender from broadcast, unable to post notification"

    const/16 v31, 0x0

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v31, v0

    invoke-static/range {v30 .. v31}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_4 .. :try_end_4} :catch_5
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_4 .. :try_end_4} :catch_6
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_7

    goto/16 :goto_0

    .line 179
    .end local v21    # "sender":Landroid/app/PendingIntent;
    :catch_1
    move-exception v9

    .line 180
    .local v9, "ex":Ljava/lang/ClassNotFoundException;
    const-string v30, "Messages - error posting notification, class not found (%s)"

    const/16 v31, 0x1

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v31, v0

    const/16 v32, 0x0

    invoke-virtual {v9}, Ljava/lang/ClassNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v33

    aput-object v33, v31, v32

    invoke-static/range {v30 .. v31}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 78
    .end local v5    # "buildVersion":I
    .end local v8    # "currentActivity":Landroid/app/Activity;
    .end local v9    # "ex":Ljava/lang/ClassNotFoundException;
    .end local v13    # "notificationActivity":Landroid/app/Activity;
    .end local v20    # "resumeIntent":Landroid/content/Intent;
    .end local v28    # "sharedContext":Landroid/content/Context;
    :catch_2
    move-exception v9

    .line 79
    .local v9, "ex":Lcom/adobe/mobile/StaticMethods$NullActivityException;
    invoke-virtual {v9}, Lcom/adobe/mobile/StaticMethods$NullActivityException;->getMessage()Ljava/lang/String;

    move-result-object v30

    const/16 v31, 0x0

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v31, v0

    invoke-static/range {v30 .. v31}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 87
    .end local v9    # "ex":Lcom/adobe/mobile/StaticMethods$NullActivityException;
    .restart local v8    # "currentActivity":Landroid/app/Activity;
    :catch_3
    move-exception v9

    .line 88
    .local v9, "ex":Lcom/adobe/mobile/StaticMethods$NullContextException;
    invoke-virtual {v9}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v30

    const/16 v31, 0x0

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v31, v0

    invoke-static/range {v30 .. v31}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 96
    .end local v9    # "ex":Lcom/adobe/mobile/StaticMethods$NullContextException;
    .restart local v13    # "notificationActivity":Landroid/app/Activity;
    .restart local v28    # "sharedContext":Landroid/content/Context;
    :catch_4
    move-exception v9

    .line 97
    .local v9, "ex":Lcom/adobe/mobile/StaticMethods$NullActivityException;
    const-string v30, "Messages - unable to find activity for your notification, using default"

    const/16 v31, 0x0

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v31, v0

    invoke-static/range {v30 .. v31}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .end local v9    # "ex":Lcom/adobe/mobile/StaticMethods$NullActivityException;
    :cond_3
    move-object/from16 v20, p2

    .line 100
    goto :goto_2

    .line 120
    .restart local v5    # "buildVersion":I
    .restart local v20    # "resumeIntent":Landroid/content/Intent;
    .restart local v21    # "sender":Landroid/app/PendingIntent;
    :cond_4
    const/16 v30, 0xb

    move/from16 v0, v30

    if-lt v5, v0, :cond_6

    .line 121
    :try_start_5
    const-class v30, Landroid/content/BroadcastReceiver;

    invoke-virtual/range {v30 .. v30}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v7

    .line 122
    .local v7, "classLoader":Ljava/lang/ClassLoader;
    const-string v30, "android.app.Notification$Builder"

    move-object/from16 v0, v30

    invoke-virtual {v7, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v15

    .line 124
    .local v15, "notificationBuilderClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    const/16 v30, 0x1

    move/from16 v0, v30

    new-array v0, v0, [Ljava/lang/Class;

    move-object/from16 v30, v0

    const/16 v31, 0x0

    const-class v32, Landroid/content/Context;

    aput-object v32, v30, v31

    move-object/from16 v0, v30

    invoke-virtual {v15, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v16

    .line 125
    .local v16, "notificationConstructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    const/16 v30, 0x1

    move-object/from16 v0, v16

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->setAccessible(Z)V

    .line 126
    const/16 v30, 0x1

    move/from16 v0, v30

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v30, v0

    const/16 v31, 0x0

    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getSharedContext()Landroid/content/Context;

    move-result-object v32

    aput-object v32, v30, v31

    move-object/from16 v0, v16

    move-object/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    .line 130
    .local v14, "notificationBuilder":Ljava/lang/Object;
    const-string v30, "setSmallIcon"

    const/16 v31, 0x1

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Class;

    move-object/from16 v31, v0

    const/16 v32, 0x0

    sget-object v33, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v33, v31, v32

    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-virtual {v15, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v27

    .line 131
    .local v27, "setSmallIcon":Ljava/lang/reflect/Method;
    const/16 v30, 0x1

    move/from16 v0, v30

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v30, v0

    const/16 v31, 0x0

    invoke-direct/range {p0 .. p0}, Lcom/adobe/mobile/MessageNotificationHandler;->getSmallIcon()I

    move-result v32

    invoke-static/range {v32 .. v32}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v32

    aput-object v32, v30, v31

    move-object/from16 v0, v27

    move-object/from16 v1, v30

    invoke-virtual {v0, v14, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    const-string v30, "setLargeIcon"

    const/16 v31, 0x1

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Class;

    move-object/from16 v31, v0

    const/16 v32, 0x0

    const-class v33, Landroid/graphics/Bitmap;

    aput-object v33, v31, v32

    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-virtual {v15, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v26

    .line 135
    .local v26, "setLargeIcon":Ljava/lang/reflect/Method;
    const/16 v30, 0x1

    move/from16 v0, v30

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v30, v0

    const/16 v31, 0x0

    invoke-direct/range {p0 .. p0}, Lcom/adobe/mobile/MessageNotificationHandler;->getLargeIcon()Landroid/graphics/Bitmap;

    move-result-object v32

    aput-object v32, v30, v31

    move-object/from16 v0, v26

    move-object/from16 v1, v30

    invoke-virtual {v0, v14, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    const-string v30, "setContentTitle"

    const/16 v31, 0x1

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Class;

    move-object/from16 v31, v0

    const/16 v32, 0x0

    const-class v33, Ljava/lang/CharSequence;

    aput-object v33, v31, v32

    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-virtual {v15, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v25

    .line 139
    .local v25, "setContentTitle":Ljava/lang/reflect/Method;
    const/16 v30, 0x1

    move/from16 v0, v30

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v30, v0

    const/16 v31, 0x0

    invoke-direct/range {p0 .. p0}, Lcom/adobe/mobile/MessageNotificationHandler;->getAppName()Ljava/lang/String;

    move-result-object v32

    aput-object v32, v30, v31

    move-object/from16 v0, v25

    move-object/from16 v1, v30

    invoke-virtual {v0, v14, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    const-string v30, "setContentText"

    const/16 v31, 0x1

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Class;

    move-object/from16 v31, v0

    const/16 v32, 0x0

    const-class v33, Ljava/lang/CharSequence;

    aput-object v33, v31, v32

    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-virtual {v15, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v24

    .line 143
    .local v24, "setContentText":Ljava/lang/reflect/Method;
    const/16 v30, 0x1

    move/from16 v0, v30

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v30, v0

    const/16 v31, 0x0

    aput-object v11, v30, v31

    move-object/from16 v0, v24

    move-object/from16 v1, v30

    invoke-virtual {v0, v14, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    const-string v30, "setContentIntent"

    const/16 v31, 0x1

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Class;

    move-object/from16 v31, v0

    const/16 v32, 0x0

    const-class v33, Landroid/app/PendingIntent;

    aput-object v33, v31, v32

    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-virtual {v15, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v23

    .line 147
    .local v23, "setContentIntent":Ljava/lang/reflect/Method;
    const/16 v30, 0x1

    move/from16 v0, v30

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v30, v0

    const/16 v31, 0x0

    aput-object v21, v30, v31

    move-object/from16 v0, v23

    move-object/from16 v1, v30

    invoke-virtual {v0, v14, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    const-string v30, "setAutoCancel"

    const/16 v31, 0x1

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Class;

    move-object/from16 v31, v0

    const/16 v32, 0x0

    sget-object v33, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v33, v31, v32

    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-virtual {v15, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v22

    .line 151
    .local v22, "setAutoCancel":Ljava/lang/reflect/Method;
    const/16 v30, 0x1

    move/from16 v0, v30

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v30, v0

    const/16 v31, 0x0

    const/16 v32, 0x1

    invoke-static/range {v32 .. v32}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v32

    aput-object v32, v30, v31

    move-object/from16 v0, v22

    move-object/from16 v1, v30

    invoke-virtual {v0, v14, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    const/16 v30, 0x10

    move/from16 v0, v30

    if-lt v5, v0, :cond_5

    .line 155
    const-string v30, "build"

    const/16 v31, 0x0

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Class;

    move-object/from16 v31, v0

    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-virtual {v15, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v4

    .line 156
    .local v4, "build":Ljava/lang/reflect/Method;
    const/16 v30, 0x0

    move/from16 v0, v30

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v30, v0

    move-object/from16 v0, v30

    invoke-virtual {v4, v14, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    .line 163
    .end local v4    # "build":Ljava/lang/reflect/Method;
    .local v12, "notification":Ljava/lang/Object;
    :goto_3
    if-eqz v12, :cond_0

    .line 176
    .end local v7    # "classLoader":Ljava/lang/ClassLoader;
    .end local v12    # "notification":Ljava/lang/Object;
    .end local v14    # "notificationBuilder":Ljava/lang/Object;
    .end local v15    # "notificationBuilderClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v16    # "notificationConstructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    .end local v22    # "setAutoCancel":Ljava/lang/reflect/Method;
    .end local v23    # "setContentIntent":Ljava/lang/reflect/Method;
    .end local v24    # "setContentText":Ljava/lang/reflect/Method;
    .end local v25    # "setContentTitle":Ljava/lang/reflect/Method;
    .end local v26    # "setLargeIcon":Ljava/lang/reflect/Method;
    .end local v27    # "setSmallIcon":Ljava/lang/reflect/Method;
    :goto_4
    const-string v30, "notification"

    move-object/from16 v0, v30

    invoke-virtual {v8, v0}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Landroid/app/NotificationManager;

    .line 177
    .local v17, "notificationManager":Landroid/app/NotificationManager;
    new-instance v30, Ljava/security/SecureRandom;

    invoke-direct/range {v30 .. v30}, Ljava/security/SecureRandom;-><init>()V

    invoke-virtual/range {v30 .. v30}, Ljava/security/SecureRandom;->nextInt()I

    move-result v30

    check-cast v12, Landroid/app/Notification;

    move-object/from16 v0, v17

    move/from16 v1, v30

    invoke-virtual {v0, v1, v12}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_7

    goto/16 :goto_0

    .line 182
    .end local v17    # "notificationManager":Landroid/app/NotificationManager;
    .end local v21    # "sender":Landroid/app/PendingIntent;
    :catch_5
    move-exception v9

    .line 183
    .local v9, "ex":Ljava/lang/NoSuchMethodException;
    const-string v30, "Messages - error posting notification, method not found (%s)"

    const/16 v31, 0x1

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v31, v0

    const/16 v32, 0x0

    invoke-virtual {v9}, Ljava/lang/NoSuchMethodException;->getMessage()Ljava/lang/String;

    move-result-object v33

    aput-object v33, v31, v32

    invoke-static/range {v30 .. v31}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 159
    .end local v9    # "ex":Ljava/lang/NoSuchMethodException;
    .restart local v7    # "classLoader":Ljava/lang/ClassLoader;
    .restart local v14    # "notificationBuilder":Ljava/lang/Object;
    .restart local v15    # "notificationBuilderClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .restart local v16    # "notificationConstructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    .restart local v21    # "sender":Landroid/app/PendingIntent;
    .restart local v22    # "setAutoCancel":Ljava/lang/reflect/Method;
    .restart local v23    # "setContentIntent":Ljava/lang/reflect/Method;
    .restart local v24    # "setContentText":Ljava/lang/reflect/Method;
    .restart local v25    # "setContentTitle":Ljava/lang/reflect/Method;
    .restart local v26    # "setLargeIcon":Ljava/lang/reflect/Method;
    .restart local v27    # "setSmallIcon":Ljava/lang/reflect/Method;
    :cond_5
    :try_start_6
    const-string v30, "getNotification"

    const/16 v31, 0x0

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Class;

    move-object/from16 v31, v0

    move-object/from16 v0, v30

    move-object/from16 v1, v31

    invoke-virtual {v15, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    .line 160
    .local v10, "getNotification":Ljava/lang/reflect/Method;
    const/16 v30, 0x0

    move/from16 v0, v30

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v30, v0

    move-object/from16 v0, v30

    invoke-virtual {v10, v14, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    .restart local v12    # "notification":Ljava/lang/Object;
    goto :goto_3

    .line 168
    .end local v7    # "classLoader":Ljava/lang/ClassLoader;
    .end local v10    # "getNotification":Ljava/lang/reflect/Method;
    .end local v12    # "notification":Ljava/lang/Object;
    .end local v14    # "notificationBuilder":Ljava/lang/Object;
    .end local v15    # "notificationBuilderClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
    .end local v16    # "notificationConstructor":Ljava/lang/reflect/Constructor;, "Ljava/lang/reflect/Constructor<*>;"
    .end local v22    # "setAutoCancel":Ljava/lang/reflect/Method;
    .end local v23    # "setContentIntent":Ljava/lang/reflect/Method;
    .end local v24    # "setContentText":Ljava/lang/reflect/Method;
    .end local v25    # "setContentTitle":Ljava/lang/reflect/Method;
    .end local v26    # "setLargeIcon":Ljava/lang/reflect/Method;
    .end local v27    # "setSmallIcon":Ljava/lang/reflect/Method;
    :cond_6
    new-instance v29, Landroid/app/Notification;

    invoke-direct/range {v29 .. v29}, Landroid/app/Notification;-><init>()V

    .line 169
    .local v29, "tempNotification":Landroid/app/Notification;
    invoke-direct/range {p0 .. p0}, Lcom/adobe/mobile/MessageNotificationHandler;->getAppName()Ljava/lang/String;

    move-result-object v30

    move-object/from16 v0, v29

    move-object/from16 v1, v28

    move-object/from16 v2, v30

    move-object/from16 v3, v21

    invoke-virtual {v0, v1, v2, v11, v3}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 170
    invoke-direct/range {p0 .. p0}, Lcom/adobe/mobile/MessageNotificationHandler;->getSmallIcon()I

    move-result v30

    move/from16 v0, v30

    move-object/from16 v1, v29

    iput v0, v1, Landroid/app/Notification;->icon:I

    .line 171
    const/16 v30, 0x10

    move/from16 v0, v30

    move-object/from16 v1, v29

    iput v0, v1, Landroid/app/Notification;->flags:I
    :try_end_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_6 .. :try_end_6} :catch_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_6 .. :try_end_6} :catch_5
    .catch Lcom/adobe/mobile/StaticMethods$NullContextException; {:try_start_6 .. :try_end_6} :catch_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_7

    .line 173
    move-object/from16 v12, v29

    .local v12, "notification":Landroid/app/Notification;
    goto :goto_4

    .line 185
    .end local v12    # "notification":Landroid/app/Notification;
    .end local v21    # "sender":Landroid/app/PendingIntent;
    .end local v29    # "tempNotification":Landroid/app/Notification;
    :catch_6
    move-exception v9

    .line 186
    .local v9, "ex":Lcom/adobe/mobile/StaticMethods$NullContextException;
    const-string v30, "Messages - error posting notification (%s)"

    const/16 v31, 0x1

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v31, v0

    const/16 v32, 0x0

    invoke-virtual {v9}, Lcom/adobe/mobile/StaticMethods$NullContextException;->getMessage()Ljava/lang/String;

    move-result-object v33

    aput-object v33, v31, v32

    invoke-static/range {v30 .. v31}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 188
    .end local v9    # "ex":Lcom/adobe/mobile/StaticMethods$NullContextException;
    :catch_7
    move-exception v9

    .line 189
    .local v9, "ex":Ljava/lang/Exception;
    const-string v30, "Messages - unexpected error posting notification (%s)"

    const/16 v31, 0x1

    move/from16 v0, v31

    new-array v0, v0, [Ljava/lang/Object;

    move-object/from16 v31, v0

    const/16 v32, 0x0

    invoke-virtual {v9}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v33

    aput-object v33, v31, v32

    invoke-static/range {v30 .. v31}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_0
.end method
