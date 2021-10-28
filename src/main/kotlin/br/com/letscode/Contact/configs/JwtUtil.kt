package br.com.letscode.Contact.configs

import io.jsonwebtoken.Claims
import io.jsonwebtoken.Jwts
import org.springframework.stereotype.Component
import java.util.*

@Component
class JwtUtil {


    fun isTokenValid(token: String): Boolean {
        val claims = getClaimsToken(token)
        if (claims != null) {
            val username = claims.subject
            val expirationDate = claims.expiration
            val now = Date(System.currentTimeMillis())
            if (username != null && expirationDate != null && now.before(expirationDate)) {
                return true
            }
        }
        return false
    }


    fun getClaimsToken(token: String): Claims? {
        return try {
            Jwts.parser().setSigningKey("dawdwad".toByteArray()).parseClaimsJws(token).body
        } catch (e: Exception) {
            null
        }
    }
}