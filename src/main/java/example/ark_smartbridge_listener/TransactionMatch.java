package example.ark_smartbridge_listener;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class TransactionMatch {
    private final String arkTransactionId;
    private final Message message;
}
