.class Lcom/kochava/android/tracker/Feature$12;
.super Ljava/lang/Thread;
.source "Feature.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/kochava/android/tracker/Feature;->getAd(Landroid/webkit/WebView;Landroid/app/Activity;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/kochava/android/tracker/Feature;

.field final synthetic val$adWebview:Landroid/webkit/WebView;

.field final synthetic val$context:Landroid/app/Activity;

.field final synthetic val$height:I

.field final synthetic val$width:I


# direct methods
.method constructor <init>(Lcom/kochava/android/tracker/Feature;Landroid/app/Activity;IILandroid/webkit/WebView;)V
    .locals 0
    .param p1, "this$0"    # Lcom/kochava/android/tracker/Feature;

    .prologue
    .line 2849
    iput-object p1, p0, Lcom/kochava/android/tracker/Feature$12;->this$0:Lcom/kochava/android/tracker/Feature;

    iput-object p2, p0, Lcom/kochava/android/tracker/Feature$12;->val$context:Landroid/app/Activity;

    iput p3, p0, Lcom/kochava/android/tracker/Feature$12;->val$width:I

    iput p4, p0, Lcom/kochava/android/tracker/Feature$12;->val$height:I

    iput-object p5, p0, Lcom/kochava/android/tracker/Feature$12;->val$adWebview:Landroid/webkit/WebView;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 28
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    .line 2855
    const-string v22, ""

    .line 2860
    .local v22, "responseString":Ljava/lang/String;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$12;->val$context:Landroid/app/Activity;

    move-object/from16 v26, v0

    invoke-virtual/range {v26 .. v26}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v18

    .line 2863
    .local v18, "pm":Landroid/content/pm/PackageManager;
    :try_start_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$12;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v26, v0

    # invokes: Lcom/kochava/android/tracker/Feature;->getAppPackageName()Ljava/lang/String;
    invoke-static/range {v26 .. v26}, Lcom/kochava/android/tracker/Feature;->access$3700(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v26

    const/16 v27, 0x0

    move-object/from16 v0, v18

    move-object/from16 v1, v26

    move/from16 v2, v27

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v4

    .line 2867
    .local v4, "ai":Landroid/content/pm/ApplicationInfo;
    :goto_0
    if-eqz v4, :cond_5

    move-object/from16 v0, v18

    invoke-virtual {v0, v4}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v26

    :goto_1
    check-cast v26, Ljava/lang/String;

    move-object/from16 v5, v26

    check-cast v5, Ljava/lang/String;

    .line 2870
    .local v5, "applicationName":Ljava/lang/String;
    const/16 v26, 0x0

    # invokes: Lcom/kochava/android/tracker/Feature;->createHttpClient(Z)Lorg/apache/http/client/HttpClient;
    invoke-static/range {v26 .. v26}, Lcom/kochava/android/tracker/Feature;->access$200(Z)Lorg/apache/http/client/HttpClient;

    move-result-object v12

    .line 2872
    .local v12, "httpclient":Lorg/apache/http/client/HttpClient;
    const/16 v19, 0x0

    .line 2874
    .local v19, "reader":Ljava/io/Reader;
    const/16 v21, 0x0

    .line 2877
    .local v21, "response":Lorg/apache/http/HttpResponse;
    :try_start_1
    # getter for: Lcom/kochava/android/tracker/Feature;->hostBidder:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$3800()Ljava/lang/String;

    move-result-object v26

    if-eqz v26, :cond_0

    # getter for: Lcom/kochava/android/tracker/Feature;->hostBidder:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$3800()Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/String;->isEmpty()Z

    move-result v26

    if-eqz v26, :cond_1

    .line 2878
    :cond_0
    const-string v26, "bidder.kochava.com"

    # setter for: Lcom/kochava/android/tracker/Feature;->hostBidder:Ljava/lang/String;
    invoke-static/range {v26 .. v26}, Lcom/kochava/android/tracker/Feature;->access$3802(Ljava/lang/String;)Ljava/lang/String;

    .line 2880
    :cond_1
    new-instance v13, Lorg/apache/http/client/methods/HttpGet;

    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    const-string v27, "https://"

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    # getter for: Lcom/kochava/android/tracker/Feature;->hostBidder:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$3800()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "/adserver/request/"

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "?w="

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    move-object/from16 v0, p0

    iget v0, v0, Lcom/kochava/android/tracker/Feature$12;->val$width:I

    move/from16 v27, v0

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "&h="

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    move-object/from16 v0, p0

    iget v0, v0, Lcom/kochava/android/tracker/Feature$12;->val$height:I

    move/from16 v27, v0

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "&odin="

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$12;->this$0:Lcom/kochava/android/tracker/Feature;

    move-object/from16 v27, v0

    .line 2883
    # invokes: Lcom/kochava/android/tracker/Feature;->getOdin()Ljava/lang/String;
    invoke-static/range {v27 .. v27}, Lcom/kochava/android/tracker/Feature;->access$3900(Lcom/kochava/android/tracker/Feature;)Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "&aid="

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    .line 2884
    # getter for: Lcom/kochava/android/tracker/Feature;->mAppId:Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$500()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "&an="

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "&av="

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "Android20150511"

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    sget-object v27, Lcom/kochava/android/tracker/Feature;->versionExtension:Ljava/lang/String;

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    const-string v27, "&kochava_device_id="

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    .line 2887
    # invokes: Lcom/kochava/android/tracker/Feature;->getDeviceId()Ljava/lang/String;
    invoke-static {}, Lcom/kochava/android/tracker/Feature;->access$1800()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-direct {v13, v0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 2892
    .local v13, "httppost":Lorg/apache/http/client/methods/HttpGet;
    invoke-interface {v12, v13}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v21

    .line 2895
    invoke-interface/range {v21 .. v21}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v10

    .line 2898
    .local v10, "entity":Lorg/apache/http/HttpEntity;
    if-eqz v10, :cond_2

    .line 2900
    invoke-interface {v10}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v14

    .line 2901
    .local v14, "is":Ljava/io/InputStream;
    new-instance v20, Ljava/io/InputStreamReader;

    const-string v26, "ISO-8859-1"

    move-object/from16 v0, v20

    move-object/from16 v1, v26

    invoke-direct {v0, v14, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_2

    .line 2902
    .end local v19    # "reader":Ljava/io/Reader;
    .local v20, "reader":Ljava/io/Reader;
    :try_start_2
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 2903
    .local v6, "buffer":Ljava/lang/StringBuilder;
    const/16 v26, 0x400

    move/from16 v0, v26

    new-array v0, v0, [C

    move-object/from16 v24, v0

    .line 2905
    .local v24, "tmp":[C
    :goto_2
    move-object/from16 v0, v20

    move-object/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/io/Reader;->read([C)I

    move-result v15

    .local v15, "l":I
    const/16 v26, -0x1

    move/from16 v0, v26

    if-eq v15, v0, :cond_6

    .line 2907
    const/16 v26, 0x0

    move-object/from16 v0, v24

    move/from16 v1, v26

    invoke-virtual {v6, v0, v1, v15}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_2

    .line 2914
    .end local v6    # "buffer":Ljava/lang/StringBuilder;
    .end local v15    # "l":I
    .end local v24    # "tmp":[C
    :catch_0
    move-exception v8

    move-object/from16 v19, v20

    .line 2916
    .end local v10    # "entity":Lorg/apache/http/HttpEntity;
    .end local v13    # "httppost":Lorg/apache/http/client/methods/HttpGet;
    .end local v14    # "is":Ljava/io/InputStream;
    .end local v20    # "reader":Ljava/io/Reader;
    .local v8, "e":Ljava/io/IOException;
    .restart local v19    # "reader":Ljava/io/Reader;
    :goto_3
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v26

    const-class v27, Ljavax/net/ssl/SSLException;

    invoke-virtual/range {v26 .. v27}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_7

    .line 2918
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    const-string v27, "SSLException! Shutting down SDK and sending report."

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    move-object/from16 v0, v26

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    invoke-static/range {v26 .. v26}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 2919
    # invokes: Lcom/kochava/android/tracker/Feature;->httpsError(Ljava/lang/Exception;)V
    invoke-static {v8}, Lcom/kochava/android/tracker/Feature;->access$1500(Ljava/lang/Exception;)V

    .line 2923
    :goto_4
    invoke-virtual {v8}, Ljava/io/IOException;->printStackTrace()V

    .line 2934
    .end local v8    # "e":Ljava/io/IOException;
    :cond_2
    :goto_5
    const-string v23, ""

    .line 2935
    .local v23, "temp":Ljava/lang/String;
    const-string v3, ""

    .line 2937
    .local v3, "adUrl":Ljava/lang/String;
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    const-string v27, "Response:"

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    move-object/from16 v0, v26

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    invoke-static/range {v26 .. v26}, Lcom/kochava/android/util/Logging;->Log(Ljava/lang/String;)V

    .line 2939
    const-string v26, "href=\'(.*?)\'"

    invoke-static/range {v26 .. v26}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v17

    .line 2940
    .local v17, "pattern":Ljava/util/regex/Pattern;
    move-object/from16 v0, v17

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v16

    .line 2941
    .local v16, "matcher":Ljava/util/regex/Matcher;
    invoke-virtual/range {v16 .. v16}, Ljava/util/regex/Matcher;->find()Z

    move-result v26

    if-eqz v26, :cond_3

    .line 2943
    const/16 v26, 0x1

    move-object/from16 v0, v16

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v23

    .line 2946
    :cond_3
    move-object/from16 v7, v23

    .line 2949
    .local v7, "clickUrl":Ljava/lang/String;
    const-string v26, "src=\'(.*?)\'"

    invoke-static/range {v26 .. v26}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v17

    .line 2950
    move-object/from16 v0, v17

    move-object/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v16

    .line 2951
    invoke-virtual/range {v16 .. v16}, Ljava/util/regex/Matcher;->find()Z

    move-result v26

    if-eqz v26, :cond_4

    .line 2953
    const/16 v26, 0x1

    move-object/from16 v0, v16

    move/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    .line 2956
    :cond_4
    move-object v11, v3

    .line 2959
    .local v11, "fAdUrl":Ljava/lang/String;
    new-instance v25, Lcom/kochava/android/tracker/Feature$12$1;

    move-object/from16 v0, v25

    move-object/from16 v1, p0

    invoke-direct {v0, v1, v7, v11}, Lcom/kochava/android/tracker/Feature$12$1;-><init>(Lcom/kochava/android/tracker/Feature$12;Ljava/lang/String;Ljava/lang/String;)V

    .line 3031
    .local v25, "updateUI":Ljava/lang/Thread;
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/kochava/android/tracker/Feature$12;->val$context:Landroid/app/Activity;

    move-object/from16 v26, v0

    move-object/from16 v0, v26

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 3037
    return-void

    .line 2864
    .end local v3    # "adUrl":Ljava/lang/String;
    .end local v4    # "ai":Landroid/content/pm/ApplicationInfo;
    .end local v5    # "applicationName":Ljava/lang/String;
    .end local v7    # "clickUrl":Ljava/lang/String;
    .end local v11    # "fAdUrl":Ljava/lang/String;
    .end local v12    # "httpclient":Lorg/apache/http/client/HttpClient;
    .end local v16    # "matcher":Ljava/util/regex/Matcher;
    .end local v17    # "pattern":Ljava/util/regex/Pattern;
    .end local v19    # "reader":Ljava/io/Reader;
    .end local v21    # "response":Lorg/apache/http/HttpResponse;
    .end local v23    # "temp":Ljava/lang/String;
    .end local v25    # "updateUI":Ljava/lang/Thread;
    :catch_1
    move-exception v8

    .line 2865
    .local v8, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    const/4 v4, 0x0

    .restart local v4    # "ai":Landroid/content/pm/ApplicationInfo;
    goto/16 :goto_0

    .line 2867
    .end local v8    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
    :cond_5
    const-string v26, "(unknown)"

    goto/16 :goto_1

    .line 2910
    .restart local v5    # "applicationName":Ljava/lang/String;
    .restart local v6    # "buffer":Ljava/lang/StringBuilder;
    .restart local v10    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v12    # "httpclient":Lorg/apache/http/client/HttpClient;
    .restart local v13    # "httppost":Lorg/apache/http/client/methods/HttpGet;
    .restart local v14    # "is":Ljava/io/InputStream;
    .restart local v15    # "l":I
    .restart local v20    # "reader":Ljava/io/Reader;
    .restart local v21    # "response":Lorg/apache/http/HttpResponse;
    .restart local v24    # "tmp":[C
    :cond_6
    :try_start_3
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_3 .. :try_end_3} :catch_3

    move-result-object v22

    move-object/from16 v19, v20

    .end local v20    # "reader":Ljava/io/Reader;
    .restart local v19    # "reader":Ljava/io/Reader;
    goto/16 :goto_5

    .line 2922
    .end local v6    # "buffer":Ljava/lang/StringBuilder;
    .end local v10    # "entity":Lorg/apache/http/HttpEntity;
    .end local v13    # "httppost":Lorg/apache/http/client/methods/HttpGet;
    .end local v14    # "is":Ljava/io/InputStream;
    .end local v15    # "l":I
    .end local v24    # "tmp":[C
    .local v8, "e":Ljava/io/IOException;
    :cond_7
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    const-string v27, "Problem grabbing ad: "

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    invoke-static/range {v26 .. v26}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    goto/16 :goto_4

    .line 2925
    .end local v8    # "e":Ljava/io/IOException;
    :catch_2
    move-exception v9

    .line 2927
    .local v9, "e1":Ljava/security/NoSuchAlgorithmException;
    :goto_6
    new-instance v26, Ljava/lang/StringBuilder;

    invoke-direct/range {v26 .. v26}, Ljava/lang/StringBuilder;-><init>()V

    const-string v27, "Problem grabbing ad: "

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual {v9}, Ljava/security/NoSuchAlgorithmException;->getMessage()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v26 .. v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v26

    invoke-virtual/range {v26 .. v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v26

    invoke-static/range {v26 .. v26}, Lcom/kochava/android/util/Logging;->LogError(Ljava/lang/String;)V

    .line 2928
    invoke-virtual {v9}, Ljava/security/NoSuchAlgorithmException;->printStackTrace()V

    goto/16 :goto_5

    .line 2925
    .end local v9    # "e1":Ljava/security/NoSuchAlgorithmException;
    .end local v19    # "reader":Ljava/io/Reader;
    .restart local v10    # "entity":Lorg/apache/http/HttpEntity;
    .restart local v13    # "httppost":Lorg/apache/http/client/methods/HttpGet;
    .restart local v14    # "is":Ljava/io/InputStream;
    .restart local v20    # "reader":Ljava/io/Reader;
    :catch_3
    move-exception v9

    move-object/from16 v19, v20

    .end local v20    # "reader":Ljava/io/Reader;
    .restart local v19    # "reader":Ljava/io/Reader;
    goto :goto_6

    .line 2914
    .end local v10    # "entity":Lorg/apache/http/HttpEntity;
    .end local v13    # "httppost":Lorg/apache/http/client/methods/HttpGet;
    .end local v14    # "is":Ljava/io/InputStream;
    :catch_4
    move-exception v8

    goto/16 :goto_3
.end method
