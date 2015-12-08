.class public Lcom/facebook/share/widget/CreateAppGroupDialog;
.super Lcom/facebook/internal/FacebookDialogBase;
.source "CreateAppGroupDialog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/share/widget/CreateAppGroupDialog$Result;,
        Lcom/facebook/share/widget/CreateAppGroupDialog$WebHandler;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/internal/FacebookDialogBase",
        "<",
        "Lcom/facebook/share/model/AppGroupCreationContent;",
        "Lcom/facebook/share/widget/CreateAppGroupDialog$Result;",
        ">;"
    }
.end annotation


# static fields
.field private static final DEFAULT_REQUEST_CODE:I

.field private static final GAME_GROUP_CREATION_DIALOG:Ljava/lang/String; = "game_group_create"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    sget-object v0, Lcom/facebook/internal/CallbackManagerImpl$RequestCodeOffset;->AppGroupCreate:Lcom/facebook/internal/CallbackManagerImpl$RequestCodeOffset;

    invoke-virtual {v0}, Lcom/facebook/internal/CallbackManagerImpl$RequestCodeOffset;->toRequestCode()I

    move-result v0

    .line 49
    sput v0, Lcom/facebook/share/widget/CreateAppGroupDialog;->DEFAULT_REQUEST_CODE:I

    .line 50
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1
    .param p1, "activity"    # Landroid/app/Activity;

    .prologue
    .line 111
    sget v0, Lcom/facebook/share/widget/CreateAppGroupDialog;->DEFAULT_REQUEST_CODE:I

    invoke-direct {p0, p1, v0}, Lcom/facebook/internal/FacebookDialogBase;-><init>(Landroid/app/Activity;I)V

    .line 112
    return-void
.end method

.method public constructor <init>(Landroid/support/v4/app/Fragment;)V
    .locals 1
    .param p1, "fragment"    # Landroid/support/v4/app/Fragment;

    .prologue
    .line 119
    sget v0, Lcom/facebook/share/widget/CreateAppGroupDialog;->DEFAULT_REQUEST_CODE:I

    invoke-direct {p0, p1, v0}, Lcom/facebook/internal/FacebookDialogBase;-><init>(Landroid/support/v4/app/Fragment;I)V

    .line 120
    return-void
.end method

.method public static canShow()Z
    .locals 1

    .prologue
    .line 77
    const/4 v0, 0x1

    return v0
.end method

.method public static show(Landroid/app/Activity;Lcom/facebook/share/model/AppGroupCreationContent;)V
    .locals 1
    .param p0, "activity"    # Landroid/app/Activity;
    .param p1, "appGroupCreationContent"    # Lcom/facebook/share/model/AppGroupCreationContent;

    .prologue
    .line 90
    new-instance v0, Lcom/facebook/share/widget/CreateAppGroupDialog;

    invoke-direct {v0, p0}, Lcom/facebook/share/widget/CreateAppGroupDialog;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, p1}, Lcom/facebook/share/widget/CreateAppGroupDialog;->show(Ljava/lang/Object;)V

    .line 91
    return-void
.end method

.method public static show(Landroid/support/v4/app/Fragment;Lcom/facebook/share/model/AppGroupCreationContent;)V
    .locals 1
    .param p0, "fragment"    # Landroid/support/v4/app/Fragment;
    .param p1, "appGroupCreationContent"    # Lcom/facebook/share/model/AppGroupCreationContent;

    .prologue
    .line 103
    new-instance v0, Lcom/facebook/share/widget/CreateAppGroupDialog;

    invoke-direct {v0, p0}, Lcom/facebook/share/widget/CreateAppGroupDialog;-><init>(Landroid/support/v4/app/Fragment;)V

    invoke-virtual {v0, p1}, Lcom/facebook/share/widget/CreateAppGroupDialog;->show(Ljava/lang/Object;)V

    .line 104
    return-void
.end method


# virtual methods
.method protected createBaseAppCall()Lcom/facebook/internal/AppCall;
    .locals 2

    .prologue
    .line 151
    new-instance v0, Lcom/facebook/internal/AppCall;

    invoke-virtual {p0}, Lcom/facebook/share/widget/CreateAppGroupDialog;->getRequestCode()I

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
            "Lcom/facebook/share/model/AppGroupCreationContent;",
            "Lcom/facebook/share/widget/CreateAppGroupDialog$Result;",
            ">.ModeHandler;>;"
        }
    .end annotation

    .prologue
    .line 156
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 157
    .local v0, "handlers":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lcom/facebook/internal/FacebookDialogBase<Lcom/facebook/share/model/AppGroupCreationContent;Lcom/facebook/share/widget/CreateAppGroupDialog$Result;>.ModeHandler;>;"
    new-instance v1, Lcom/facebook/share/widget/CreateAppGroupDialog$WebHandler;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/facebook/share/widget/CreateAppGroupDialog$WebHandler;-><init>(Lcom/facebook/share/widget/CreateAppGroupDialog;Lcom/facebook/share/widget/CreateAppGroupDialog$WebHandler;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
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
            "Lcom/facebook/share/widget/CreateAppGroupDialog$Result;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 126
    .local p2, "callback":Lcom/facebook/FacebookCallback;, "Lcom/facebook/FacebookCallback<Lcom/facebook/share/widget/CreateAppGroupDialog$Result;>;"
    if-nez p2, :cond_0

    .line 127
    const/4 v1, 0x0

    .line 135
    .local v1, "resultProcessor":Lcom/facebook/share/internal/ResultProcessor;
    :goto_0
    new-instance v0, Lcom/facebook/share/widget/CreateAppGroupDialog$2;

    invoke-direct {v0, p0, v1}, Lcom/facebook/share/widget/CreateAppGroupDialog$2;-><init>(Lcom/facebook/share/widget/CreateAppGroupDialog;Lcom/facebook/share/internal/ResultProcessor;)V

    .line 146
    .local v0, "callbackManagerCallback":Lcom/facebook/internal/CallbackManagerImpl$Callback;
    invoke-virtual {p0}, Lcom/facebook/share/widget/CreateAppGroupDialog;->getRequestCode()I

    move-result v2

    invoke-virtual {p1, v2, v0}, Lcom/facebook/internal/CallbackManagerImpl;->registerCallback(ILcom/facebook/internal/CallbackManagerImpl$Callback;)V

    .line 147
    return-void

    .line 128
    .end local v0    # "callbackManagerCallback":Lcom/facebook/internal/CallbackManagerImpl$Callback;
    .end local v1    # "resultProcessor":Lcom/facebook/share/internal/ResultProcessor;
    :cond_0
    new-instance v1, Lcom/facebook/share/widget/CreateAppGroupDialog$1;

    invoke-direct {v1, p0, p2, p2}, Lcom/facebook/share/widget/CreateAppGroupDialog$1;-><init>(Lcom/facebook/share/widget/CreateAppGroupDialog;Lcom/facebook/FacebookCallback;Lcom/facebook/FacebookCallback;)V

    goto :goto_0
.end method
