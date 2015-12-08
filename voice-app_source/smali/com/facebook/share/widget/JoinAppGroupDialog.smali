.class public Lcom/facebook/share/widget/JoinAppGroupDialog;
.super Lcom/facebook/internal/FacebookDialogBase;
.source "JoinAppGroupDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/widget/JoinAppGroupDialog$Result;,
        Lcom/facebook/share/widget/JoinAppGroupDialog$WebHandler;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/internal/FacebookDialogBase",
        "<",
        "Ljava/lang/String;",
        "Lcom/facebook/share/widget/JoinAppGroupDialog$Result;",
        ">;"
    }
.end annotation


# static fields
.field private static final DEFAULT_REQUEST_CODE:I

.field private static final JOIN_GAME_GROUP_DIALOG:Ljava/lang/String; = "game_group_join"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 49
    sget-object v0, Lcom/facebook/internal/CallbackManagerImpl$RequestCodeOffset;->AppGroupJoin:Lcom/facebook/internal/CallbackManagerImpl$RequestCodeOffset;

    invoke-virtual {v0}, Lcom/facebook/internal/CallbackManagerImpl$RequestCodeOffset;->toRequestCode()I

    move-result v0

    .line 48
    sput v0, Lcom/facebook/share/widget/JoinAppGroupDialog;->DEFAULT_REQUEST_CODE:I

    .line 49
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 110
    sget v0, Lcom/facebook/share/widget/JoinAppGroupDialog;->DEFAULT_REQUEST_CODE:I

    invoke-direct {p0, p1, v0}, Lcom/facebook/internal/FacebookDialogBase;-><init>(Landroid/app/Activity;I)V

    .line 111
    return-void
.end method

.method public constructor <init>(Landroid/support/v4/app/Fragment;)V
    .locals 1
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 118
    sget v0, Lcom/facebook/share/widget/JoinAppGroupDialog;->DEFAULT_REQUEST_CODE:I

    invoke-direct {p0, p1, v0}, Lcom/facebook/internal/FacebookDialogBase;-><init>(Landroid/support/v4/app/Fragment;I)V

    .line 119
    return-void
.end method

.method public static canShow()Z
    .locals 1

    .prologue
    .line 76
    const/4 v0, 0x1

    return v0
.end method

.method public static show(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 1
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "groupId"    # Ljava/lang/String;

    .prologue
    .line 89
    new-instance v0, Lcom/facebook/share/widget/JoinAppGroupDialog;

    invoke-direct {v0, p0}, Lcom/facebook/share/widget/JoinAppGroupDialog;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, p1}, Lcom/facebook/share/widget/JoinAppGroupDialog;->show(Ljava/lang/Object;)V

    .line 90
    return-void
.end method

.method public static show(Landroid/support/v4/app/Fragment;Ljava/lang/String;)V
    .locals 1
    .param p0, "fragment"    # Landroid/support/v4/app/Fragment;
    .param p1, "groupId"    # Ljava/lang/String;

    .prologue
    .line 102
    new-instance v0, Lcom/facebook/share/widget/JoinAppGroupDialog;

    invoke-direct {v0, p0}, Lcom/facebook/share/widget/JoinAppGroupDialog;-><init>(Landroid/support/v4/app/Fragment;)V

    invoke-virtual {v0, p1}, Lcom/facebook/share/widget/JoinAppGroupDialog;->show(Ljava/lang/Object;)V

    .line 103
    return-void
.end method


# virtual methods
.method protected createBaseAppCall()Lcom/facebook/internal/AppCall;
    .locals 2

    .prologue
    .line 150
    new-instance v0, Lcom/facebook/internal/AppCall;

    invoke-virtual {p0}, Lcom/facebook/share/widget/JoinAppGroupDialog;->getRequestCode()I

    move-result v1

    invoke-direct {v0, v1}, Lcom/facebook/internal/AppCall;-><init>(I)V

    return-object v0
.end method

.method protected getOrderedModeHandlers()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/internal/FacebookDialogBase",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/share/widget/JoinAppGroupDialog$Result;",
            ">.ModeHandler;>;"
        }
    .end annotation

    .prologue
    .line 155
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 156
    .local v0, "handlers":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/facebook/internal/FacebookDialogBase<Ljava/lang/String;Lcom/facebook/share/widget/JoinAppGroupDialog$Result;>.ModeHandler;>;"
    new-instance v1, Lcom/facebook/share/widget/JoinAppGroupDialog$WebHandler;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/share/widget/JoinAppGroupDialog$WebHandler;-><init>(Lcom/facebook/share/widget/JoinAppGroupDialog;Lcom/facebook/share/widget/JoinAppGroupDialog$WebHandler;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 158
    return-object v0
.end method

.method protected registerCallbackImpl(Lcom/facebook/internal/CallbackManagerImpl;Lcom/facebook/FacebookCallback;)V
    .locals 3
    .param p1, "callbackManager"    # Lcom/facebook/internal/CallbackManagerImpl;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/internal/CallbackManagerImpl;",
            "Lcom/facebook/FacebookCallback",
            "<",
            "Lcom/facebook/share/widget/JoinAppGroupDialog$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 125
    .local p2, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/widget/JoinAppGroupDialog$Result;>;"
    if-nez p2, :cond_0

    .line 126
    const/4 v1, 0x0

    .line 134
    .local v1, "resultProcessor":Lcom/facebook/share/internal/ResultProcessor;
    :goto_0
    new-instance v0, Lcom/facebook/share/widget/JoinAppGroupDialog$2;

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/widget/JoinAppGroupDialog$2;-><init>(Lcom/facebook/share/widget/JoinAppGroupDialog;Lcom/facebook/share/internal/ResultProcessor;)V

    .line 145
    .local v0, "callbackManagerCallback":Lcom/facebook/internal/CallbackManagerImpl$Callback;
    invoke-virtual {p0}, Lcom/facebook/share/widget/JoinAppGroupDialog;->getRequestCode()I

    move-result v2

    invoke-virtual {p1, v2, v0}, Lcom/facebook/internal/CallbackManagerImpl;->registerCallback(ILcom/facebook/internal/CallbackManagerImpl$Callback;)V

    .line 146
    return-void

    .line 127
    .end local v0    # "callbackManagerCallback":Lcom/facebook/internal/CallbackManagerImpl$Callback;
    .end local v1    # "resultProcessor":Lcom/facebook/share/internal/ResultProcessor;
    :cond_0
    new-instance v1, Lcom/facebook/share/widget/JoinAppGroupDialog$1;

    invoke-direct {v1, p0, p2, p2}, Lcom/facebook/share/widget/JoinAppGroupDialog$1;-><init>(Lcom/facebook/share/widget/JoinAppGroupDialog;Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookCallback;)V

    goto :goto_0
.end method
