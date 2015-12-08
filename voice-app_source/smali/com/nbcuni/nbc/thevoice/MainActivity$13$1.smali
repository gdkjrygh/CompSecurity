.class Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;
.super Landroid/webkit/WebViewClient;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/nbcuni/nbc/thevoice/MainActivity$13;->onCreateWindow(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;


# direct methods
.method constructor <init>(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)V
    .locals 0

    .prologue
    .line 1
    iput-object p1, p0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    .line 1072
    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 16
    .param p1, "view"    # Landroid/webkit/WebView;
    .param p2, "url"    # Ljava/lang/String;

    .prologue
    .line 1077
    const-string v14, "emopenwebview"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_1

    .line 1078
    const-string v14, "emopenwebview=1"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_0

    .line 1079
    new-instance v6, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    const-class v15, Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-direct {v6, v14, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1080
    .local v6, "intent":Landroid/content/Intent;
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1081
    .local v1, "b":Landroid/os/Bundle;
    const-string v14, "nav"

    const/4 v15, 0x0

    invoke-virtual {v1, v14, v15}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1082
    const-string v14, "key"

    move-object/from16 v0, p2

    invoke-virtual {v1, v14, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1083
    invoke-virtual {v6, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1084
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    invoke-virtual {v14, v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1085
    const/4 v14, 0x1

    .line 1163
    .end local v1    # "b":Landroid/os/Bundle;
    .end local v6    # "intent":Landroid/content/Intent;
    :goto_0
    return v14

    .line 1088
    :cond_0
    const-string v14, "emopenwebview=0"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_1

    .line 1089
    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v13

    .line 1090
    .local v13, "uri":Landroid/net/Uri;
    new-instance v2, Landroid/content/Intent;

    const-string v14, "android.intent.action.VIEW"

    invoke-direct {v2, v14, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1091
    .local v2, "browserIntent":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    invoke-virtual {v14, v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1092
    const/4 v14, 0x1

    goto :goto_0

    .line 1095
    .end local v2    # "browserIntent":Landroid/content/Intent;
    .end local v13    # "uri":Landroid/net/Uri;
    :cond_1
    const-string v14, "www.facebook.com"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_2

    const-string v14, "dialog/feed"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_2

    .line 1096
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    move-object/from16 v0, p2

    invoke-virtual {v14, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->handleFacebookShare(Ljava/lang/String;)V

    .line 1097
    const/4 v14, 0x1

    goto :goto_0

    .line 1099
    :cond_2
    const-string v14, "www.facebook.com"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_3

    const-string v14, "dialog/oauth"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_3

    .line 1100
    new-instance v6, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    const-class v15, Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-direct {v6, v14, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1101
    .restart local v6    # "intent":Landroid/content/Intent;
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1102
    .restart local v1    # "b":Landroid/os/Bundle;
    const-string v14, "nav"

    const/4 v15, 0x0

    invoke-virtual {v1, v14, v15}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1103
    const-string v14, "key"

    move-object/from16 v0, p2

    invoke-virtual {v1, v14, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1104
    invoke-virtual {v6, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1105
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    invoke-virtual {v14, v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1106
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1109
    .end local v1    # "b":Landroid/os/Bundle;
    .end local v6    # "intent":Landroid/content/Intent;
    :cond_3
    const-string v14, "market://"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_4

    .line 1110
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    move-object/from16 v0, p2

    # invokes: Lcom/nbcuni/nbc/thevoice/MainActivity;->openAppStore(Ljava/lang/String;)V
    invoke-static {v14, v0}, Lcom/nbcuni/nbc/thevoice/MainActivity;->access$23(Lcom/nbcuni/nbc/thevoice/MainActivity;Ljava/lang/String;)V

    .line 1111
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1114
    :cond_4
    const-string v14, "twitter.com"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v14

    if-eqz v14, :cond_5

    .line 1115
    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v13

    .line 1116
    .restart local v13    # "uri":Landroid/net/Uri;
    new-instance v12, Landroid/content/Intent;

    const-string v14, "android.intent.action.VIEW"

    invoke-direct {v12, v14, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1117
    .local v12, "tweetIntent":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    const-string v15, "Tweet!"

    invoke-static {v12, v15}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v15

    invoke-virtual {v14, v15}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1118
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1121
    .end local v12    # "tweetIntent":Landroid/content/Intent;
    .end local v13    # "uri":Landroid/net/Uri;
    :cond_5
    const-string v14, "sms:"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_6

    .line 1123
    const-string v14, ":"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    .line 1124
    .local v3, "cIndex":I
    const-string v14, "?"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v9

    .line 1125
    .local v9, "qIndex":I
    const-string v14, "="

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v5

    .line 1126
    .local v5, "eIndex":I
    add-int/lit8 v14, v3, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v14, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    .line 1127
    .local v11, "to":Ljava/lang/String;
    add-int/lit8 v14, v5, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v7

    .line 1129
    .local v7, "message":Ljava/lang/String;
    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "smsto:"

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v13

    .line 1130
    .restart local v13    # "uri":Landroid/net/Uri;
    new-instance v10, Landroid/content/Intent;

    const-string v14, "android.intent.action.SENDTO"

    invoke-direct {v10, v14, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1131
    .local v10, "smsIntent":Landroid/content/Intent;
    const-string v14, "sms_body"

    invoke-virtual {v10, v14, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1132
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    invoke-virtual {v14, v10}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1133
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1136
    .end local v3    # "cIndex":I
    .end local v5    # "eIndex":I
    .end local v7    # "message":Ljava/lang/String;
    .end local v9    # "qIndex":I
    .end local v10    # "smsIntent":Landroid/content/Intent;
    .end local v11    # "to":Ljava/lang/String;
    .end local v13    # "uri":Landroid/net/Uri;
    :cond_6
    const-string v14, "popup-nav"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_7

    .line 1137
    new-instance v6, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    const-class v15, Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-direct {v6, v14, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1138
    .restart local v6    # "intent":Landroid/content/Intent;
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1139
    .restart local v1    # "b":Landroid/os/Bundle;
    const-string v14, "nav"

    const/4 v15, 0x1

    invoke-virtual {v1, v14, v15}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1140
    const-string v14, ":"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    .line 1141
    .local v8, "paramIndex":I
    add-int/lit8 v14, v8, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 1142
    .local v4, "cutUrl":Ljava/lang/String;
    const-string v14, "key"

    invoke-virtual {v1, v14, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1143
    invoke-virtual {v6, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1144
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    invoke-virtual {v14, v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1145
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1148
    .end local v1    # "b":Landroid/os/Bundle;
    .end local v4    # "cutUrl":Ljava/lang/String;
    .end local v6    # "intent":Landroid/content/Intent;
    .end local v8    # "paramIndex":I
    :cond_7
    const-string v14, "popup"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_8

    .line 1149
    new-instance v6, Landroid/content/Intent;

    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    const-class v15, Lcom/nbcuni/nbc/thevoice/PopupActivity;

    invoke-direct {v6, v14, v15}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1150
    .restart local v6    # "intent":Landroid/content/Intent;
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1151
    .restart local v1    # "b":Landroid/os/Bundle;
    const-string v14, "nav"

    const/4 v15, 0x0

    invoke-virtual {v1, v14, v15}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1152
    const-string v14, ":"

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    .line 1153
    .restart local v8    # "paramIndex":I
    add-int/lit8 v14, v8, 0x1

    move-object/from16 v0, p2

    invoke-virtual {v0, v14}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    .line 1154
    .restart local v4    # "cutUrl":Ljava/lang/String;
    const-string v14, "key"

    invoke-virtual {v1, v14, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1155
    invoke-virtual {v6, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 1156
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    invoke-virtual {v14, v6}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1157
    const/4 v14, 0x1

    goto/16 :goto_0

    .line 1160
    .end local v1    # "b":Landroid/os/Bundle;
    .end local v4    # "cutUrl":Ljava/lang/String;
    .end local v6    # "intent":Landroid/content/Intent;
    .end local v8    # "paramIndex":I
    :cond_8
    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v13

    .line 1161
    .restart local v13    # "uri":Landroid/net/Uri;
    new-instance v2, Landroid/content/Intent;

    const-string v14, "android.intent.action.VIEW"

    invoke-direct {v2, v14, v13}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 1162
    .restart local v2    # "browserIntent":Landroid/content/Intent;
    move-object/from16 v0, p0

    iget-object v14, v0, Lcom/nbcuni/nbc/thevoice/MainActivity$13$1;->this$1:Lcom/nbcuni/nbc/thevoice/MainActivity$13;

    # getter for: Lcom/nbcuni/nbc/thevoice/MainActivity$13;->this$0:Lcom/nbcuni/nbc/thevoice/MainActivity;
    invoke-static {v14}, Lcom/nbcuni/nbc/thevoice/MainActivity$13;->access$0(Lcom/nbcuni/nbc/thevoice/MainActivity$13;)Lcom/nbcuni/nbc/thevoice/MainActivity;

    move-result-object v14

    invoke-virtual {v14, v2}, Lcom/nbcuni/nbc/thevoice/MainActivity;->startActivity(Landroid/content/Intent;)V

    .line 1163
    const/4 v14, 0x1

    goto/16 :goto_0
.end method
