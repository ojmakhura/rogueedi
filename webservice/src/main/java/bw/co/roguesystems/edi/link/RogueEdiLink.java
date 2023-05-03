package bw.co.roguesystems.edi.link;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bw.co.roguesystems.edi.bomaid.ClaimHeader;
import bw.co.roguesystems.edi.medscheme.ClaimRequest;
import bw.co.roguesystems.edi.medscheme.ClaimType;

@RestController
@RequestMapping("/link")
public class RogueEdiLink {
    
    public RogueEdiLink() {

    }

    @PostMapping(name = "/medscheme")
    public ResponseEntity<?> afaLink(@RequestBody ClaimRequest claim) {

        for(ClaimType c : claim.getClaim()) {
            
        }

        return ResponseEntity.ok().build();
    }

    @PostMapping("/bomaid")
    public ResponseEntity<?> bomaidLink(@RequestBody ClaimHeader claimHeader) {

        return ResponseEntity.ok().build();
    }
}
