.class Lcom/facebook/login/widget/LoginButton$LoginClickListener;
.super Ljava/lang/Object;
.source "LoginButton.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/widget/LoginButton;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LoginClickListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/login/widget/LoginButton;


# direct methods
.method private constructor <init>(Lcom/facebook/login/widget/LoginButton;)V
    .locals 0

    .prologue
    .line 674
    iput-object p1, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/login/widget/LoginButton;Lcom/facebook/login/widget/LoginButton$LoginClickListener;)V
    .locals 0

    .prologue
    .line 674
    invoke-direct {p0, p1}, Lcom/facebook/login/widget/LoginButton$LoginClickListener;-><init>(Lcom/facebook/login/widget/LoginButton;)V

    return-void
.end method

.method static synthetic access$1(Lcom/facebook/login/widget/LoginButton$LoginClickListener;)Lcom/facebook/login/widget/LoginButton;
    .locals 1

    .prologue
    .line 674
    iget-object v0, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    return-object v0
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 14
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 678
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    # invokes: Lcom/facebook/login/widget/LoginButton;->callExternalOnClickListener(Landroid/view/View;)V
    invoke-static {v10, p1}, Lcom/facebook/login/widget/LoginButton;->access$0(Lcom/facebook/login/widget/LoginButton;Landroid/view/View;)V

    .line 680
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getContext()Landroid/content/Context;

    move-result-object v3

    .line 682
    .local v3, "context":Landroid/content/Context;
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    .line 684
    .local v0, "accessToken":Lcom/facebook/AccessToken;
    if-eqz v0, :cond_2

    .line 686
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    # getter for: Lcom/facebook/login/widget/LoginButton;->confirmLogout:Z
    invoke-static {v10}, Lcom/facebook/login/widget/LoginButton;->access$1(Lcom/facebook/login/widget/LoginButton;)Z

    move-result v10

    if-eqz v10, :cond_1

    .line 688
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    .line 689
    sget v11, Lcom/facebook/R$string;->com_facebook_loginview_log_out_action:I

    .line 688
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 690
    .local v6, "logout":Ljava/lang/String;
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    .line 691
    sget v11, Lcom/facebook/R$string;->com_facebook_loginview_cancel_action:I

    .line 690
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 693
    .local v2, "cancel":Ljava/lang/String;
    invoke-static {}, Lcom/facebook/Profile;->getCurrentProfile()Lcom/facebook/Profile;

    move-result-object v9

    .line 694
    .local v9, "profile":Lcom/facebook/Profile;
    if-eqz v9, :cond_0

    invoke-virtual {v9}, Lcom/facebook/Profile;->getName()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_0

    .line 696
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    .line 697
    sget v11, Lcom/facebook/R$string;->com_facebook_loginview_logged_in_as:I

    .line 696
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x1

    new-array v11, v11, [Ljava/lang/Object;

    const/4 v12, 0x0

    .line 698
    invoke-virtual {v9}, Lcom/facebook/Profile;->getName()Ljava/lang/String;

    move-result-object v13

    aput-object v13, v11, v12

    .line 695
    invoke-static {v10, v11}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 703
    .local v7, "message":Ljava/lang/String;
    :goto_0
    new-instance v1, Landroid/app/AlertDialog$Builder;

    invoke-direct {v1, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 704
    .local v1, "builder":Landroid/app/AlertDialog$Builder;
    invoke-virtual {v1, v7}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v10

    .line 705
    const/4 v11, 0x1

    invoke-virtual {v10, v11}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;

    move-result-object v10

    .line 706
    new-instance v11, Lcom/facebook/login/widget/LoginButton$LoginClickListener$1;

    invoke-direct {v11, p0}, Lcom/facebook/login/widget/LoginButton$LoginClickListener$1;-><init>(Lcom/facebook/login/widget/LoginButton$LoginClickListener;)V

    invoke-virtual {v10, v6, v11}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v10

    .line 711
    const/4 v11, 0x0

    invoke-virtual {v10, v2, v11}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 712
    invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v10

    invoke-virtual {v10}, Landroid/app/AlertDialog;->show()V

    .line 744
    .end local v1    # "builder":Landroid/app/AlertDialog$Builder;
    .end local v2    # "cancel":Ljava/lang/String;
    .end local v6    # "logout":Ljava/lang/String;
    .end local v7    # "message":Ljava/lang/String;
    .end local v9    # "profile":Lcom/facebook/Profile;
    :goto_1
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10}, Lcom/facebook/appevents/AppEventsLogger;->newLogger(Landroid/content/Context;)Lcom/facebook/appevents/AppEventsLogger;

    move-result-object v4

    .line 746
    .local v4, "logger":Lcom/facebook/appevents/AppEventsLogger;
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 747
    .local v8, "parameters":Landroid/os/Bundle;
    const-string v11, "logging_in"

    if-eqz v0, :cond_6

    const/4 v10, 0x0

    :goto_2
    invoke-virtual {v8, v11, v10}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 749
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    # getter for: Lcom/facebook/login/widget/LoginButton;->loginLogoutEventName:Ljava/lang/String;
    invoke-static {v10}, Lcom/facebook/login/widget/LoginButton;->access$4(Lcom/facebook/login/widget/LoginButton;)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v4, v10, v11, v8}, Lcom/facebook/appevents/AppEventsLogger;->logSdkEvent(Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;)V

    .line 750
    return-void

    .line 700
    .end local v4    # "logger":Lcom/facebook/appevents/AppEventsLogger;
    .end local v8    # "parameters":Landroid/os/Bundle;
    .restart local v2    # "cancel":Ljava/lang/String;
    .restart local v6    # "logout":Ljava/lang/String;
    .restart local v9    # "profile":Lcom/facebook/Profile;
    :cond_0
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    .line 701
    sget v11, Lcom/facebook/R$string;->com_facebook_loginview_logged_in_using_facebook:I

    .line 700
    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    .restart local v7    # "message":Ljava/lang/String;
    goto :goto_0

    .line 714
    .end local v2    # "cancel":Ljava/lang/String;
    .end local v6    # "logout":Ljava/lang/String;
    .end local v7    # "message":Ljava/lang/String;
    .end local v9    # "profile":Lcom/facebook/Profile;
    :cond_1
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getLoginManager()Lcom/facebook/login/LoginManager;

    move-result-object v10

    invoke-virtual {v10}, Lcom/facebook/login/LoginManager;->logOut()V

    goto :goto_1

    .line 717
    :cond_2
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getLoginManager()Lcom/facebook/login/LoginManager;

    move-result-object v5

    .line 718
    .local v5, "loginManager":Lcom/facebook/login/LoginManager;
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getDefaultAudience()Lcom/facebook/login/DefaultAudience;

    move-result-object v10

    invoke-virtual {v5, v10}, Lcom/facebook/login/LoginManager;->setDefaultAudience(Lcom/facebook/login/DefaultAudience;)Lcom/facebook/login/LoginManager;

    .line 719
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getLoginBehavior()Lcom/facebook/login/LoginBehavior;

    move-result-object v10

    invoke-virtual {v5, v10}, Lcom/facebook/login/LoginManager;->setLoginBehavior(Lcom/facebook/login/LoginBehavior;)Lcom/facebook/login/LoginManager;

    .line 721
    sget-object v10, Lcom/facebook/internal/LoginAuthorizationType;->PUBLISH:Lcom/facebook/internal/LoginAuthorizationType;

    iget-object v11, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    # getter for: Lcom/facebook/login/widget/LoginButton;->properties:Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;
    invoke-static {v11}, Lcom/facebook/login/widget/LoginButton;->access$2(Lcom/facebook/login/widget/LoginButton;)Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;

    move-result-object v11

    # getter for: Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;->authorizationType:Lcom/facebook/internal/LoginAuthorizationType;
    invoke-static {v11}, Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;->access$0(Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;)Lcom/facebook/internal/LoginAuthorizationType;

    move-result-object v11

    invoke-virtual {v10, v11}, Lcom/facebook/internal/LoginAuthorizationType;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    .line 722
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getFragment()Landroid/support/v4/app/Fragment;

    move-result-object v10

    if-eqz v10, :cond_3

    .line 724
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getFragment()Landroid/support/v4/app/Fragment;

    move-result-object v10

    .line 725
    iget-object v11, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    # getter for: Lcom/facebook/login/widget/LoginButton;->properties:Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;
    invoke-static {v11}, Lcom/facebook/login/widget/LoginButton;->access$2(Lcom/facebook/login/widget/LoginButton;)Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;

    move-result-object v11

    # getter for: Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;->permissions:Ljava/util/List;
    invoke-static {v11}, Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;->access$1(Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;)Ljava/util/List;

    move-result-object v11

    .line 723
    invoke-virtual {v5, v10, v11}, Lcom/facebook/login/LoginManager;->logInWithPublishPermissions(Landroid/support/v4/app/Fragment;Ljava/util/Collection;)V

    goto :goto_1

    .line 728
    :cond_3
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    # invokes: Lcom/facebook/login/widget/LoginButton;->getActivity()Landroid/app/Activity;
    invoke-static {v10}, Lcom/facebook/login/widget/LoginButton;->access$3(Lcom/facebook/login/widget/LoginButton;)Landroid/app/Activity;

    move-result-object v10

    .line 729
    iget-object v11, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    # getter for: Lcom/facebook/login/widget/LoginButton;->properties:Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;
    invoke-static {v11}, Lcom/facebook/login/widget/LoginButton;->access$2(Lcom/facebook/login/widget/LoginButton;)Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;

    move-result-object v11

    # getter for: Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;->permissions:Ljava/util/List;
    invoke-static {v11}, Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;->access$1(Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;)Ljava/util/List;

    move-result-object v11

    .line 727
    invoke-virtual {v5, v10, v11}, Lcom/facebook/login/LoginManager;->logInWithPublishPermissions(Landroid/app/Activity;Ljava/util/Collection;)V

    goto/16 :goto_1

    .line 732
    :cond_4
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getFragment()Landroid/support/v4/app/Fragment;

    move-result-object v10

    if-eqz v10, :cond_5

    .line 734
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    invoke-virtual {v10}, Lcom/facebook/login/widget/LoginButton;->getFragment()Landroid/support/v4/app/Fragment;

    move-result-object v10

    .line 735
    iget-object v11, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    # getter for: Lcom/facebook/login/widget/LoginButton;->properties:Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;
    invoke-static {v11}, Lcom/facebook/login/widget/LoginButton;->access$2(Lcom/facebook/login/widget/LoginButton;)Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;

    move-result-object v11

    # getter for: Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;->permissions:Ljava/util/List;
    invoke-static {v11}, Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;->access$1(Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;)Ljava/util/List;

    move-result-object v11

    .line 733
    invoke-virtual {v5, v10, v11}, Lcom/facebook/login/LoginManager;->logInWithReadPermissions(Landroid/support/v4/app/Fragment;Ljava/util/Collection;)V

    goto/16 :goto_1

    .line 738
    :cond_5
    iget-object v10, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    # invokes: Lcom/facebook/login/widget/LoginButton;->getActivity()Landroid/app/Activity;
    invoke-static {v10}, Lcom/facebook/login/widget/LoginButton;->access$3(Lcom/facebook/login/widget/LoginButton;)Landroid/app/Activity;

    move-result-object v10

    .line 739
    iget-object v11, p0, Lcom/facebook/login/widget/LoginButton$LoginClickListener;->this$0:Lcom/facebook/login/widget/LoginButton;

    # getter for: Lcom/facebook/login/widget/LoginButton;->properties:Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;
    invoke-static {v11}, Lcom/facebook/login/widget/LoginButton;->access$2(Lcom/facebook/login/widget/LoginButton;)Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;

    move-result-object v11

    # getter for: Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;->permissions:Ljava/util/List;
    invoke-static {v11}, Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;->access$1(Lcom/facebook/login/widget/LoginButton$LoginButtonProperties;)Ljava/util/List;

    move-result-object v11

    .line 737
    invoke-virtual {v5, v10, v11}, Lcom/facebook/login/LoginManager;->logInWithReadPermissions(Landroid/app/Activity;Ljava/util/Collection;)V

    goto/16 :goto_1

    .line 747
    .end local v5    # "loginManager":Lcom/facebook/login/LoginManager;
    .restart local v4    # "logger":Lcom/facebook/appevents/AppEventsLogger;
    .restart local v8    # "parameters":Landroid/os/Bundle;
    :cond_6
    const/4 v10, 0x1

    goto/16 :goto_2
.end method
