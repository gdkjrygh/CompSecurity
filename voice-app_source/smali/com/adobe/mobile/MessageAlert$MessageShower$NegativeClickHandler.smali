.class final Lcom/adobe/mobile/MessageAlert$MessageShower$NegativeClickHandler;
.super Ljava/lang/Object;
.source "MessageAlert.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/adobe/mobile/MessageAlert$MessageShower;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "NegativeClickHandler"
.end annotation


# instance fields
.field private final message:Lcom/adobe/mobile/MessageAlert;


# direct methods
.method public constructor <init>(Lcom/adobe/mobile/MessageAlert;)V
    .locals 0
    .param p1, "messageToActOn"    # Lcom/adobe/mobile/MessageAlert;

    .prologue
    .line 189
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 190
    iput-object p1, p0, Lcom/adobe/mobile/MessageAlert$MessageShower$NegativeClickHandler;->message:Lcom/adobe/mobile/MessageAlert;

    .line 191
    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2
    .param p1, "dialogInterface"    # Landroid/content/DialogInterface;
    .param p2, "i"    # I

    .prologue
    .line 196
    iget-object v0, p0, Lcom/adobe/mobile/MessageAlert$MessageShower$NegativeClickHandler;->message:Lcom/adobe/mobile/MessageAlert;

    invoke-virtual {v0}, Lcom/adobe/mobile/MessageAlert;->viewed()V

    .line 197
    iget-object v0, p0, Lcom/adobe/mobile/MessageAlert$MessageShower$NegativeClickHandler;->message:Lcom/adobe/mobile/MessageAlert;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/adobe/mobile/MessageAlert;->isVisible:Z

    .line 198
    return-void
.end method
