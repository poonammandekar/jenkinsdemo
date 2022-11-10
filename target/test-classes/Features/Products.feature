Feature: इस फाइल में प्रोडक्ट की सारी टेस्ट केसेस है

Scenario: Verify search result for polo men.
Given  क्रोम ब्राउज़र खुला  होना चाहिए 
And मिंत्रा का पेज खुला होना चाहिए 
When user searches for polo T shirt
Then all result should be related to polo
