package io.enjincoin.sdk.client.service.legacy.tokens;

import java.util.concurrent.CompletableFuture;

import io.enjincoin.sdk.client.service.tokens.vo.Token;
import io.enjincoin.sdk.client.vo.token.CreateTokenRequestVO;
import io.enjincoin.sdk.client.vo.token.CreateTokenResponseVO;
import io.enjincoin.sdk.client.vo.token.UpdateTokenRequestVO;

/**
 * Asynchronous Tokens service interface.
 */
public interface AsynchronousTokensService {

    /**
     * Method to get all tokens.
     *
     *
     * @return - TokenResponseVO
     */
    CompletableFuture<Token[]> getTokensAsync();

    /**
     * Method to get a token by id
     * @param tokenId for the token to retrieve
     * @return
     */
    CompletableFuture<Token> getTokenAsync(Integer tokenId);

    /**
     * Method to create a token
     * @param createTokenRequestVO - the new token details
     * @return
     */
    CompletableFuture<CreateTokenResponseVO> createTokenAsync(CreateTokenRequestVO createTokenRequestVO);

    /**
     * Method to update a token
     * @param  updateTokenRequestVO - the updated token details
     * @param tokenId the token to update
     * @return TokenResponseVO
     */
    CompletableFuture<Token> updateTokenAsync(UpdateTokenRequestVO updateTokenRequestVO, Integer tokenId);

    /**
     * Method to delete a token
     * @param tokenId the token to delete
     * @return Boolean
     */
    CompletableFuture<Boolean> deleteTokenAsync(Integer tokenId);
}
