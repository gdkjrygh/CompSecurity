.class final Lcom/adobe/mobile/MessageAlert$MessageShower;
.super Ljava/lang/Object;
.source "MessageAlert.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adobe/mobile/MessageAlert;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "MessageShower"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/adobe/mobile/MessageAlert$MessageShower$CancelClickHandler;,
        Lcom/adobe/mobile/MessageAlert$MessageShower$NegativeClickHandler;,
        Lcom/adobe/mobile/MessageAlert$MessageShower$PositiveClickHandler;
    }
.end annotation


# instance fields
.field private final message:Lcom/adobe/mobile/MessageAlert;


# direct methods
.method public constructor <init>(Lcom/adobe/mobile/MessageAlert;)V
    .locals 0
    .param p1, "messageToActOn"    # Lcom/adobe/mobile/MessageAlert;

    .prologue
    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    iput-object p1, p0, Lcom/adobe/mobile/MessageAlert$MessageShower;->message:Lcom/adobe/mobile/MessageAlert;

    .line 140
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 218
    :try_start_0
    invoke-static {}, Lcom/adobe/mobile/StaticMethods;->getCurrentActivity()Landroid/app/Activity;
    :try_end_0
    .catch Lcom/adobe/mobile/StaticMethods$NullActivityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    .line 226
    .local v1, "currentActivity":Landroid/app/Activity;
    :try_start_1
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 227
    .local v0, "builder":Landroid/app/AlertDialog$Builder;
    iget-object v3, p0, Lcom/adobe/mobile/MessageAlert$MessageShower;->message:Lcom/adobe/mobile/MessageAlert;

    iget-object v3, v3, Lcom/adobe/mobile/MessageAlert;->title:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 228
    iget-object v3, p0, Lcom/adobe/mobile/MessageAlert$MessageShower;->message:Lcom/adobe/mobile/MessageAlert;

    iget-object v3, v3, Lcom/adobe/mobile/MessageAlert;->content:Ljava/lang/String;

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 230
    iget-object v3, p0, Lcom/adobe/mobile/MessageAlert$MessageShower;->message:Lcom/adobe/mobile/MessageAlert;

    iget-object v3, v3, Lcom/adobe/mobile/MessageAlert;->confirmButtonText:Ljava/lang/String;

    new-instance v4, Lcom/adobe/mobile/MessageAlert$MessageShower$PositiveClickHandler;

    iget-object v5, p0, Lcom/adobe/mobile/MessageAlert$MessageShower;->message:Lcom/adobe/mobile/MessageAlert;

    invoke-direct {v4, v5}, Lcom/adobe/mobile/MessageAlert$MessageShower$PositiveClickHandler;-><init>(Lcom/adobe/mobile/MessageAlert;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 231
    iget-object v3, p0, Lcom/adobe/mobile/MessageAlert$MessageShower;->message:Lcom/adobe/mobile/MessageAlert;

    iget-object v3, v3, Lcom/adobe/mobile/MessageAlert;->cancelButtonText:Ljava/lang/String;

    new-instance v4, Lcom/adobe/mobile/MessageAlert$MessageShower$NegativeClickHandler;

    iget-object v5, p0, Lcom/adobe/mobile/MessageAlert$MessageShower;->message:Lcom/adobe/mobile/MessageAlert;

    invoke-direct {v4, v5}, Lcom/adobe/mobile/MessageAlert$MessageShower$NegativeClickHandler;-><init>(Lcom/adobe/mobile/MessageAlert;)V

    invoke-virtual {v0, v3, v4}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 232
    new-instance v3, Lcom/adobe/mobile/MessageAlert$MessageShower$CancelClickHandler;

    iget-object v4, p0, Lcom/adobe/mobile/MessageAlert$MessageShower;->message:Lcom/adobe/mobile/MessageAlert;

    invoke-direct {v3, v4}, Lcom/adobe/mobile/MessageAlert$MessageShower$CancelClickHandler;-><init>(Lcom/adobe/mobile/MessageAlert;)V

    invoke-virtual {v0, v3}, Landroid/app/AlertDialog$Builder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/AlertDialog$Builder;

    .line 234
    iget-object v3, p0, Lcom/adobe/mobile/MessageAlert$MessageShower;->message:Lcom/adobe/mobile/MessageAlert;

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v4

    iput-object v4, v3, Lcom/adobe/mobile/MessageAlert;->alertDialog:Landroid/app/AlertDialog;

    .line 235
    iget-object v3, p0, Lcom/adobe/mobile/MessageAlert$MessageShower;->message:Lcom/adobe/mobile/MessageAlert;

    iget-object v3, v3, Lcom/adobe/mobile/MessageAlert;->alertDialog:Landroid/app/AlertDialog;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 236
    iget-object v3, p0, Lcom/adobe/mobile/MessageAlert$MessageShower;->message:Lcom/adobe/mobile/MessageAlert;

    iget-object v3, v3, Lcom/adobe/mobile/MessageAlert;->alertDialog:Landroid/app/AlertDialog;

    invoke-virtual {v3}, Landroid/app/AlertDialog;->show()V

    .line 238
    iget-object v3, p0, Lcom/adobe/mobile/MessageAlert$MessageShower;->message:Lcom/adobe/mobile/MessageAlert;

    const/4 v4, 0x1

    iput-boolean v4, v3, Lcom/adobe/mobile/MessageAlert;->isVisible:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 243
    .end local v0    # "builder":Landroid/app/AlertDialog$Builder;
    .end local v1    # "currentActivity":Landroid/app/Activity;
    :goto_0
    return-void

    .line 220
    :catch_0
    move-exception v2

    .line 221
    .local v2, "ex":Lcom/adobe/mobile/StaticMethods$NullActivityException;
    invoke-virtual {v2}, Lcom/adobe/mobile/StaticMethods$NullActivityException;->getMessage()Ljava/lang/String;

    move-result-object v3

    new-array v4, v6, [Ljava/lang/Object;

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logErrorFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 240
    .end local v2    # "ex":Lcom/adobe/mobile/StaticMethods$NullActivityException;
    .restart local v1    # "currentActivity":Landroid/app/Activity;
    :catch_1
    move-exception v2

    .line 241
    .local v2, "ex":Ljava/lang/Exception;
    const-string v3, "Messages - Could not show alert message (%s)"

    new-array v4, v7, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v4, v6

    invoke-static {v3, v4}, Lcom/adobe/mobile/StaticMethods;->logDebugFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
