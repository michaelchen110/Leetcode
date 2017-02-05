def solution(S, K):
    s = ""
    for i in reversed(range(len(S))):
        if len(s)%(K+1) == K and len(s) > 0:
            s = '-' + s
        if S[i] == '-':
            continue
        elif S[i] > 'Z':
            s = chr(ord(S[i])-32) + s
        else:
            s = S[i] + s
    return s
print solution("sS-dfSfa", 2)
