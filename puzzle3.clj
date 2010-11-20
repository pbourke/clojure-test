; Solution to:
;
; http://www.facebook.com/careers/puzzles.php#!/careers/puzzles.php?puzzle_id=20
;
; Copyright (c) Patrick Bourke, 2010.
;
; Facebook Engineering Puzzles: Liar, Liar
; 
; Analysis: 
; We can model this problem as a graph. Let the individuals be nodes and let
; the accusations be directed edges from accuser to accused. The problem can be
; reduced to finding a graph cut which starts with a node that does not have
; any incoming edges yet has one or more outgoing edges. We can add this node
; to our 'honest' set. Any children can be added to the 'liar' set. We can
; perform a graph traversal from the starting node in order to classify all
; connected nodes as 'honest' or 'liar'.
;
; There is a complication with nodes which are disjoint - we need to perform
; the above steps until all nodes in the graph are classified. Thus, at any
; given step we'll have 3 sets of nodes: unclassified, honest and liars. The
; goal is to reduce the unclassified nodes to the empty set.
